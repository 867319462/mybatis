package com.mapper;

import com.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogMapper
 * @Description blog接口
 * @Author WangXL
 * @Date 2020/2/4 13:10
 **/
public interface BlogMapper {

    /**
     * 添加博客
     * @param blog 博客对象
     * @return 成功行数
     */
    @Insert("insert into blog(id,title,author,create_time,views) value(#{id},#{title},#{author},#{createTime},#{views})")
    int addBlog(Blog blog);

    /**
     * 使用if语句查询博客
     * @param map 条件
     * @return 博客信息
     */
    List<Blog> queryBlogByIf(Map<String,String> map);

    /**
     * 使用choose语句查询博客
     * @param map 条件
     * @return 博客信息
     */
    List<Blog> queryBlogByChoose(Map map);

    /**
     * 使用Set语句更新博客信息
     * @param map 条件
     * @return 成功行数
     */
    int updateBlogBySet(Map map);

    /**
     * 使用Foreach语句查询博客信息
     * @param map 条件
     * @return 博客信息
     */
    List<Blog> queryBlogByForEach(Map map);
}
