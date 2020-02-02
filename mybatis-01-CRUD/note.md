## 第一个mybatis
1. 导入mysql、mybatis依赖包
2. 配置mybatis-config.xml（连接数据库、）
3. 添加数据库表的实体类
4. 填写mapper接口
5. 配置mapper.xml
6. 将mapper.xml注册到mybatis-config.xml中
7. 在pom.xml中添加扫描
```xml
<build>
    <resources>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
        <resource>
            <directory>src/main/resource</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
    </resources>
</build>
```
- 添加工具类（SqlSessionFactoryBuild-->SqlSessionFactory-->SqlSession）
- com.mapper.xml 中 parameterType 参数类型 ，resultType 返回值类型
- 增删改需要提交事务
- 如果表的字段太多，可以考虑使用map
- 模糊查询需要注意防止SQL注入
