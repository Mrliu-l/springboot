package com.assembly.springboot.starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Test2SpringBootJdbcTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void addData(){
        String sql = "insert into user (name,age) values ('Mr.liu',18)";
        jdbcTemplate.execute(sql);
    }
}
