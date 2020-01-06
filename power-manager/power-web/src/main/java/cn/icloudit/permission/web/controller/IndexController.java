package cn.icloudit.permission.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("{dir}/{page}")
    public String page(@PathVariable("dir") String dir, @PathVariable("page") String page){
        return dir + "/" + page;
    }
}
