package com.mapper;

import com.pojo.User;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author WangXL
 * @Date 2020/2/1 12:50
 **/
public class UserMapperTest {
    @Test
    public void selectUser() {
        // 1. 获取SqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        // 2. 第一种方式  getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("-----------------------我是分割线----------------------");
        // 2. 第二种方式
        List<User> list = sqlSession.selectList("com.com.mapper.UserMapper.selectUser");
        for (User user : list) {
            System.out.println(user);
        }

        // 3. 关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int row = mapper.addUser(new User(10, "Bob", 11, "东北"));
        System.out.println("创建用户成功数：" + row);

        // 增、删、改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUserAgeById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setId(13);
        user.setAge(30);
        int row = mapper.updateUserAgeById(user);
        System.out.println("修改用户成功数：" + row);

        // 增、删、改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int row = mapper.deleteUserById(13);
        System.out.println("删除用户成功数：" + row);

        // 增、删、改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectUserByName(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list = mapper.getUserByName("%李%");
        for (User user : list) {
            System.out.println(user);
        }

        // 增、删、改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
