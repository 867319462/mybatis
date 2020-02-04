## resultMap
- 可以对返回结果集进行映射

### 分页
- 第一种方式，SQL语句中的limit
- 第二种方式，Java中的RowBounds
- 其他：有各种分页插件，比如mybatisHelper


### 多对一
1. 子查询
    - 多个查询
    - resultMap映射时需要将子查询关联
    ```xml
     <resultMap id="StudentAndTeacher" type="Student">
        <result property="id" column="id"/>
        <result property="name" column="name"/>
        <!--复杂的属性，我们需要单独处理，对象：association  集合：collection-->
        <!--property 遍历名；column 数据库字段名；javaType 类名；select 查询id-->
        <association property="teacher" column="teacherId" javaType="Teacher" select="getTeacher"/>
    </resultMap>
    ```
2. 关联查询
    - 只需要一个关联查询
    - 只需要映射对应位置
    ```xml
    <resultMap id="StudentAndTeacher2" type="Student">
        <result property="id" column="sid"/>
        <result property="name" column="sname"/>
        <association property="teacher" javaType="Teacher">
            <result property="name" column="tname" />
        </association>
    </resultMap>
    ```
### 一对多
1. 子查询
    - 多个查询
    - resultMap映射
    ```xml
    <resultMap id="TeacherStudent2" type="Teacher">
        <result property="id" column="id"/>
        <collection property="students" column="id" javaType="ArrayList" ofType="Student" select="getStudent"/>
    </resultMap>
    ```
2. 关联查询
    - 一个查询
    - 配置映射
    ```xml
    <resultMap id="TeacherStudent" type="Teacher">
        <result property="id" column="tid"/>
        <result property="name" column="tname"/>
        <!--复杂的属性，我们需要单独处理，对象：association  集合：collection
            javaType="" 指定属性的类型
            集合中的泛型信息，使用ofType获取
        -->
        <collection property="students" ofType="Student">
            <result property="id" column="sid"/>
            <result property="name" column="sname"/>
            <result property="teacherId" column="tid"/>
        </collection>
    </resultMap>
    ```

### resultMap中的属性
- association 对象元素
- collection 集合元素
- javaType java类
- ofType 泛型
- property 属性
- column 数据库字段
