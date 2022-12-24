package com.test.webservice.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    //@GetMapping("/")
    @RequestMapping(value="/", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "Welcome To My Homepage it myweb";
    }
}
