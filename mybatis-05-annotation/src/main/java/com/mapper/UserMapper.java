package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author WangXL
 * @Date 2020/2/1 12:37
 **/
public interface UserMapper {

    /**
     * 查询所有用户信息
     *
     * @return 用户信息
     */
    @Select("select * from user")
    List<User> selectUsers();

    /**
     * 添加用户
     *
     * @param user 用户信息
     * @return 成功行数
     */
    @Insert("insert into user(name,age,address) value(#{name},#{age},#{address})")
    int addUser(User user);

    /**
     * 根据id删除用户
     *
     * @param id 用户id
     * @return 成功行数
     */
    @Delete("delete from user where id=#{id}")
    int deleteUserById(@Param("id") int id);

    /**
     * 根据id修改年龄
     *
     * @param id  用户id
     * @param age 年龄
     * @return 成功行数
     */
    @Update(("update user set age=#{age} where id=#{id}"))
    int updateUserById(@Param("id") int id, @Param("age") int age);
}
