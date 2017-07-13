package com.claudia.portfolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Portfolio {
    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
    
    @RequestMapping("/myprojects")
    public String projects() {
        return "forward:/projects.html";
    }
    
    @RequestMapping("/me")
    public String about() {
        return "forward:/about.html";
    }
}