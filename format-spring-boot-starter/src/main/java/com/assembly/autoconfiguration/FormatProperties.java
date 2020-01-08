package com.assembly.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @ClassName FormatProperties
 * @Description 实现使用者在spring.properties中配置变量
 * @Author liulei33
 * @Time 2020/1/8 11:39
 */
@ConfigurationProperties(prefix = FormatProperties.FORMAT_PREFIX)
public class FormatProperties {

    //prefix不支持大写字母
    protected static final String FORMAT_PREFIX = "mrliu.format";

    private Map<String, Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
