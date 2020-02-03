package com.mapper;

import com.pojo.User;

/**
 * @ClassName UserMapper
 * @Description
 * @Author WangXL
 * @Date 2020/2/1 12:37
 **/
public interface UserMapper {

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    public User getUserById(int id);

}
