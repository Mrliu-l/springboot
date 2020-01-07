package com.assembly.autoconfiguration;

import com.assembly.FormatTemplate;
import com.assembly.format.FormatProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName TemplateAutoConfiguration
 * @Description TODO
 * @Author liulei33
 * @Time 2020/1/7 15:32
 */
@Import(ProcessorAutoConfiguration.class)
@Configuration
public class TemplateAutoConfiguration {

    @Bean
    public FormatTemplate formatTemplate(FormatProcessor formatProcessor){
        return new FormatTemplate(formatProcessor);
    }
}
