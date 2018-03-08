package com.didispace.chapter1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lh on 2018/3/7.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody String index() {
        return "Hello World";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://haha.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

}