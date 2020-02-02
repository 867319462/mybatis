## mybatis配置
- mybatis可以配置多套运行环境
- mybatis默认的事务管理器是：JDBC
- mybatis默认的连接池是：POOLED

### properties 配置
properties 属性配置外部文件

### typeAliases 别名
typeAliases 给实体类起别名
   - typeAlias 单个实体类起别名
   - package 给一个包下的所有类起别名
   - 扫描包时可以使用注解@Alias给类起别名

### mapper 映射器
1. 使用相对于类路径的资源引用
2. 使用映射器接口实现类的完全限定类名
3. 将包内的映射器接口实现全部注册为映射器

### 声明周期
- SqlSessionFactoryBuilder：
    - 一旦创建了SqlSessionFactory，就不再需要它了
    - 局部变量
- SqlSessionFactory：
    - 可以想象为：数据库连接池
    - 一旦被创建就应该在应用的运行期间一直存在，**没有任何理由丢弃或重新创建一个实例**
    - 最佳作用域为应用作用域
    - 单例模式或者静态**单例模式**
- SqlSession：
    - 连接到连接池的一个请求
    - 线程不安全，不能被共享
    - 最佳作用域为方法作用域
    - 使用完后应关闭，否则会占用资源
