package com.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @Author WangXL
 * @Date 2020/2/4 19:28
 **/
@Data
public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private String address;
}
