package com.mapper;

import com.pojo.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author WangXL
 * @Date 2020/2/1 12:37
 **/
public interface UserMapper {
    /**
     * 查询用户信息
     * @return 用户信息
     */
    public List<User> selectUser();

    /**
     * 根据id查询用户信息
     * @param id 用户id
     * @return 用户信息
     */
    public User getUserById(int id);

    /**
     * 根据姓名进行模糊查询用户信息
     * @param name 用户名
     * @return 用户信息
     */
    public List<User> getUserByName(String name);

    /**
     * 插入一个用户
     * @param user 用户
     * @return 成功行数
     */
    public int addUser(User user);

    /**
     * 根据id修改用户年龄
     * @param user 用户信息
     * @return 成功行数
     */
    public int updateUserAgeById(User user);

    /**
     * 根据id删除用户
     * @param id 用户id
     * @return 成功行数
     */
    public int deleteUserById(int id);
}
