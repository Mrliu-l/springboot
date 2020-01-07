package com.assembly.format;

/**
 * @ClassName StringFormatProcessor
 * @Description String序列化
 * @Author liulei33
 * @Time 2020/1/7 15:13
 */
public class StringFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T obj) {
        return "StringFormatProcessor : " + obj.toString();
    }
}
