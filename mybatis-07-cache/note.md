## cache

### 一级缓存
- SqlSession级别
- 默认开启
- 就是一个map
- 缓存失效情况
    - 查询不同mapper
    - 增删改之后
    - 手动清理缓存

### 二级缓存
- 需要在配置文件中开启
- namespace级别
- 需要给实体类序列化


####缓存机制
- 所有数据都会先放在一级缓存中
- 只有当会话提交、关闭时，才会提交到二级缓存
- 新的请求会先查二级缓存，再查一级缓存，最会才会查数据库
