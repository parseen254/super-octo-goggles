package com.ogenalabs.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;


    @RequestMapping("/")
    public String index() {
        System.out.println("appName: "+appName);
        return "index.html";
    }

}
