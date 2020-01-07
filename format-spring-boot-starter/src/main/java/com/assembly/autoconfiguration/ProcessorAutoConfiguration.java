package com.assembly.autoconfiguration;

import com.assembly.format.FastJsonFormatProcessor;
import com.assembly.format.FormatProcessor;
import com.assembly.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ClassName FormatAutoConfiguration
 * @Description 根据condition进行装备指定bean
 * @Author liulei33
 * @Time 2020/1/7 15:23
 */
@Configuration
public class ProcessorAutoConfiguration {


    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Primary
    @Bean
    public FormatProcessor stringFormat(){
        return new StringFormatProcessor();
    }

    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    public FormatProcessor fastJsonFormat(){
        return new FastJsonFormatProcessor();
    }
}
