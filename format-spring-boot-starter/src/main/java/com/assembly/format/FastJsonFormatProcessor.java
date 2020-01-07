package com.assembly.format;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName FastJsonFormatProcessor
 * @Description 利用fastjson进行序列化
 * @Author liulei33
 * @Time 2020/1/7 15:15
 */
public class FastJsonFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T obj) {
        return "FastJsonFormatProcessor : " + JSON.toJSONString(obj);
    }
}
