package com.mapper;

import com.pojo.User;

import java.util.List;
import java.util.Map;

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
    User getUserById(int id);

    /**
     * 分页获取用户信息
     *
     * @param map 存储起始下标、每页条数的map
     * @return 用户信息
     */
    List<User> getLimitUser(Map<String, Integer> map);

    /**
     * 使用rowBounds进行进行分页
     *
     * @return 用户信息
     */
    List<User> getUserByRowBounds();

}
