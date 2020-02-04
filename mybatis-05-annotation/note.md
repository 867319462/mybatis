## 注解

- 绑定接口
- 注解版增删改查
- 自动事务
- @Param("XXX")
    - 基本类型与String类型参数需要添加
    - 引用类型不需要添加
    - 如果只有一个基本类型参数|，可以忽略
    - 在SQL中引用的就是@Param中的属性名
- “#{}” 预编译
- “${}” 占位符，存在SQL注入风险

### lombok
- 添加lombok插件
- 添加lombok依赖
- @Data
    - 无参构造
    - getter/setter
    - toString
    - hashCode
    - equal
- @AllArgsConstructor 全参构造
- @NoArgsConstructor 无参构造
