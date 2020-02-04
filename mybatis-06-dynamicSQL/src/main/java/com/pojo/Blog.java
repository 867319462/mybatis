package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Blog
 * @Description 博客
 * @Author WangXL
 * @Date 2020/2/4 13:05
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
