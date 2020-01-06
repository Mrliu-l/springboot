package com.assembly.springboot.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName StartMain
 * @Description spring启动方式
 * @Author liulei33
 * @Time 2019/12/30 17:29
 */
public class StartMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationMain.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(int i = 0; i < beanDefinitionNames.length; i++){
            System.out.println(beanDefinitionNames[i]);
        }
    }
}
