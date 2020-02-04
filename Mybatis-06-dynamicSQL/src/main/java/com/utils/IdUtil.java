package com.utils;

import java.util.UUID;

/**
 * @ClassName IdUtil
 * @Description id工具类
 * @Author WangXL
 * @Date 2020/2/4 13:20
 **/
public class IdUtil {

    /**
     * 获取UUID
     * @return UUID
     */
    public static String getId() {
        return UUID.randomUUID().toString();
    }
}
