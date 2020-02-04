package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author WangXL
 * @Date 2020/2/4 19:29
 **/
public interface UserMapper {

    /**
     * 查询所有用户
     * @return 用户信息
     */
    List<User> selectUser();

    User queryUser(@Param("id") int id);
}
