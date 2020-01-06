package com.assembly.springboot.second.current;

import com.assembly.springboot.second.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName CurrentConfig
 * @Description @Import验证可以加载多个config
 * @Author liulei33
 * @Time 2019/12/30 17:39
 */
@Import(OtherConfig.class)
@Configuration
public class CurrentConfig {

    @Bean
    public DefalutBean defalutBean(){
        return new DefalutBean();
    }
}
