package com.assembly;

import com.assembly.autoconfiguration.FormatProperties;
import com.assembly.format.FormatProcessor;

/**
 * @ClassName FormatTemplate
 * @Description format模板，包装后对外提供
 * @Author liulei33
 * @Time 2020/1/7 15:17
 */
public class FormatTemplate {

    private FormatProcessor formatProcessor;

    private FormatProperties formatProperties;

    public FormatTemplate(FormatProcessor formatProcessor, FormatProperties formatProperties){
        this.formatProcessor = formatProcessor;
        this.formatProperties = formatProperties;
    }

    public <T> String doFormat(T obj){
        System.out.println(formatProperties.getInfo().toString());
        return  formatProcessor.format(obj);
    }
}
