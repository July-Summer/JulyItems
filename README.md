# JulyItems
自定义RPG物品

# 物品编辑
/julyitem <itemID> remove   删除一个物品
/julyitem <itemID> create   新建一个物品
/julyitem <itemID> setType  设置物品材质为手中物品
/julyitem <itemID> setDurability <最大耐久度>  设置物品的最大耐久 (如果物品有耐久)
/julyitem <itemID> setDisplayName <display>  设置物品显示名
/julyitem <itemID> addLore <描述>  增加一行描述
/julyitem <itemID> editLore <行数> <描述>  编辑一行描述
/julyitem <itemID> removeLore <行数>  删除一行描述
/julyitem <itemID> addEnchantment <附魔> <等级>  添加附魔
/julyitem <itemID> removeEnchantment <附魔>  移除附魔
/julyitem <itemID> setUnbreakable <true/false>  设置物品为无限耐久 true为是 false为否
/julyitem <itemID> setCheckEnchantment <true/false>  设置是否允许附魔变动 true为是 false为否
/julyitem <itemID> setDisplayLore <true/false>  设置是否显示默认Lore true为是 false为否
/julyitem <itemID> setDisplayCooldown <true/false>  设置是否显示冷却true为是 false为否
/julyitem <itemID> setLore <true/false>  设置是否允许Lore变动 true为是 false为否
# 物品属性
/julyitem <itemID> setMinDamage <整数>  设置物品的最小伤害(注: 手持生效)
/julyitem <itemID> setMaxDamage <整数>  设置物品的最大伤害(注: 手持生效)
/julyitem <itemID> setArmor <整数>  设置物品的护甲(注: 只在装备栏生效)
/julyitem <itemID> addPotion <药水> <触发方式> <持续时间> <等级>  为物品添加药水效果
/julyitem <itemID> removePotion <药水>   移除物品的药水效果
/julyitem <itemID> addDrop <生物种类> <几率>  添加掉落
/julyitem <itemID> removeDrop <生物种类>  移除掉落
/julyitem <itemID> addFlag <ItemFlag>  为物品添加ItemFlag #该版本尚未上传
/julyitem <itemID> removeFlag <ItemFlag>  移除物品的ItemFlag #该版本尚未上传
/julyitem <itemID> setRecipe <合成几率>  设置该物品的合成表, 如果需要删除请在合成几率输入任意字符
  
# 物品技能

/julyitem <itemID> addSkill firearrow <触发方式> <触发目标> <伤害> <冷却>  添加火箭技能
/julyitem <itemID> addSkill teleport <触发方式> <触发目标> <传送距离> <冷却>  添加传送技能
/julyitem <itemID> addSkill <触发方式> <触发目标> instantkill <几率>  添加瞬杀技能
/julyitem <itemID> addSkill fireball <触发方式> <触发目标> <伤害> <冷却>  添加火球技能
/julyitem <itemID> addSkill cmd <触发方式> <是否OP权限执行> <冷却> <命令>  添加执行命令 true为是 false 为否 {player}为玩家变量
/julyitem <itemID> addSkill consume <触发方式> <冷却>  使该物品消耗
/julyitem <itemID> addSkill blinding <触发方式> <触发目标> <几率> <持续时间> <持续等级>  添加致盲技能
/julyitem <itemID> addSkill light <触发方式> <触发目标> <几率> <伤害>  添加闪电技能
/julyitem <itemID> addSkill recoil <触发方式> <触发对象> <退后倍数> <冷却>  添加退后技能(用作后坐力或弹跳)
/julyitem <itemID> addSkill chain <直线距离>  添加连锁挖矿技能 #该版本尚未上传
/julyitem <itemID> addSkill ignite <触发方式> <触发对象> <几率> <持续时间:秒>  添加点燃技能
/julyitem <itemID> removeSkill <触发方式> <技能>   移除物品的技能
  
# 插件管理
/julyitem <itemID> update   立即更新当前物品
/julyitem <itemID> getItem   获取物品
/julyitem <itemID> giveItem <Player>  发送物品
/julyitem list   列出所有物品
/julyitem reload   重载插件
  
# 触发方式

LEFT_CLICK(左键)
RIGHT_CLICK(右键)
FIRST_HELD(首次手持)
LAST_HELD(持续手持)
ATTACK(攻击玩家和生物) #该版本尚未上传
ATTACK_PLAYER(攻击玩家) #该版本尚未上传
ATTACK_ENTITY(攻击生物) #该版本尚未上传
GET_DAMAGE(受到伤害) #该版本尚未上传
GET_ENTITY_DAMAGE(受到生物伤害) #该版本尚未上传
GET_PLAYER_DAMAGE(受到玩家伤害) #该版本尚未上传
BREAK_BLOCK(破坏方块时) #该版本尚未上传

  # 触发对象
PLAYER (玩家)
EVENT_ENTITY, (事件生物)
RANDOM_SERVER_PLAYER,(服务期内随机玩家)
RANDOM_WORLD_PLAYER,(世界内随机玩家)
RANDOM_NEARBY_ENTITY,(附近随机生物)
RANDOM_NEARBY_PLAYER,(附近随机玩家)
NEARBY_ENTITY,(附近所有生物)
NEARBY_PLAYER;(附近所有玩家)
 # 药水
 
 https://github.com/July-Summer/JulyItems/blob/master/src/main/resources/potion_chinese.json
 
 # 附魔
 
https://hub.spigotmc.org/javadocs/spigot/org/bukkit/enchantments/Enchantment.html

很抱歉思路出了点问题, 导致插件放了几个月 最后再回来看就很懵逼, 写有#a该版本尚未上传的都是2.0的功能 我会尽快解决
  
