package com.assembly.springboot.starter;

import com.assembly.FormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author liulei33
 * @Time 2020/1/7 17:19
 */
@RestController
public class FormatController {

    @Autowired
    private FormatTemplate formatTemplate;


    @GetMapping("/format")
    public String format(){
        User user = new User();
        user.setName("Mr.liu");
        user.setAge(18);
        return formatTemplate.doFormat(user);
    }
}
