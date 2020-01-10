package com.assembly.springboot.starter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringbootStarterDemoApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void addData(){
        String sql = "insert into user (name,age) values ('Mr.liu',18)";
        jdbcTemplate.execute(sql);
    }
}
