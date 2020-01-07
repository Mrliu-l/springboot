package com.assembly;

import com.assembly.format.FormatProcessor;

/**
 * @ClassName FormatTemplate
 * @Description format模板，包装后对外提供
 * @Author liulei33
 * @Time 2020/1/7 15:17
 */
public class FormatTemplate {

    private FormatProcessor formatProcessor;

    public FormatTemplate(FormatProcessor formatProcessor){
        this.formatProcessor = formatProcessor;
    }

    public <T> String format(T obj){
      return  formatProcessor.format(obj);
    }
}
