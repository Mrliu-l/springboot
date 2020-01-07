package com.assembly.format;

/**
 * 模板化接口，多个子类，根据condition进行决定注入哪个子类bean
 */
public interface FormatProcessor {

    <T> String format(T obj);
}
