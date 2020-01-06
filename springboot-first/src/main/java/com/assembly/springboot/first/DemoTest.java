package com.assembly.springboot.first;

import org.springframework.stereotype.Component;

/**
 * @ClassName DemoTest
 * @Description TODO
 * @Author liulei33
 * @Time 2019/12/12 14:59
 */
@Component
public class DemoTest {

    //再次验证，bean实例化会走class的无参构造方法，
    // 如果没有无参构造方法，需要指定入参为什么，否则初始化报错
    public DemoTest() {
        this.say();
    }

    public void say(){
        System.out.println("say hello");
    }
}
