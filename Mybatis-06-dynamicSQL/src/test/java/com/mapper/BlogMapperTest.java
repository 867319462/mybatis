package com.mapper;

import com.pojo.Blog;
import com.utils.IdUtil;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName BlogMapperTest
 * @Description
 * @Author WangXL
 * @Date 2020/2/4 13:39
 **/
public class BlogMapperTest {
    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtil.getId());
        blog.setTitle("spring博客");
        blog.setAuthor("admin");
        blog.setCreateTime(new Date());
        mapper.addBlog(blog);

        blog.setId(IdUtil.getId());
        blog.setTitle("spring Boot博客");
        mapper.addBlog(blog);

        blog.setId(IdUtil.getId());
        blog.setTitle("mybatis博客");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogByIf() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<>();
        map.put("author", "admin");
        map.put("title", "%spring%");
        List<Blog> blogs = mapper.queryBlogByIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogByChoose() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<>();
        map.put("author", "admin");
        List<Blog> blogs = mapper.queryBlogByChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlogBySet() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<>();
        map.put("author", "lei");
        map.put("id", "3a5c6acb-4474-4135-ad3c-1f92cfcbe23c");
        mapper.updateBlogBySet(map);

        sqlSession.close();
    }
    @Test
    public void queryBlogByForEach() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String,List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("3a5c6acb-4474-4135-ad3c-1f92cfcbe23c");
        list.add("7c40aa0c-2924-4fd7-8bca-5f7dd8aa2e3f");
        list.add("9e35093a-8a64-4d70-8292-4e7d4c856512");
        map.put("ids", list);
        List<Blog> blogs = mapper.queryBlogByForEach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
