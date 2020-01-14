package com.assembly.springboot.starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName Test2MoreJdbcTemplate
 * @Description TODO
 * @Author liulei33
 * @Time 2020/1/10 14:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test2MoreJdbcTemplate {

    @Autowired
    private JdbcTemplate db1JdbcTemplate;

    @Autowired
    private JdbcTemplate db2JdbcTemplate;

    @Test
    public void addDb(){
        String sql = "insert into user (name,age) values ('Mr.liu_Db1', 19)";
        String sql1 = "insert into user (name,age) values ('Mr.liu_Db2', 19)";
        db1JdbcTemplate.execute(sql);
        db2JdbcTemplate.execute(sql1);
    }

//    @Test
//    public void addDb1(){
//        String sql = "insert into test (name,age) values ('Mr.liu_Db1', 18)";
//        db1JdbcTemplate.execute(sql);
//    }
}
