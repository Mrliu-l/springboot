package com.assembly.springboot.second.current;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName SecondMain
 * @Description spring使用@config方式进行加载bean，并且扩展加载多个@config配置
 * @Author liulei33
 * @Time 2019/12/30 17:38
 */
public class SecondMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CurrentConfig.class);
        String[] defNames = applicationContext.getBeanDefinitionNames();
        for(int i=0;i<defNames.length;i++){
            System.out.println(defNames[i]);
        }
    }
}
