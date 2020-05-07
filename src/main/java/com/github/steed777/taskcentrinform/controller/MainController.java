package com.github.steed777.taskcentrinform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MainController {
    @GetMapping("/")
    public String greeting() {
        return "greeting";
    }

    /*@GetMapping("/main")
    public String main() {
        return "main";
    }

    @PostMapping("/main")
    public String add(){
        return "main";
    }*/
}
