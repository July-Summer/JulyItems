package github.july_summer.julyitems.effects;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.concurrent.*;

public class AsyncEval {

    public static ScriptEngine js = new ScriptEngineManager().getEngineByName("js");
    public static ExecutorService es = Executors.newFixedThreadPool(10);;

    private Future future;
    private double value = 0.0;

    public AsyncEval(String str){
        future = es.submit(() -> {
            try {
                value = (double) js.eval(str);
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        });
    }

    public double get(){
        try {
            future.get(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return value;
    }

}
