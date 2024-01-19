package com.example.fristTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping("/main")
    public String main(Model model){
        return "main"; //templates/main.mustache 를 브라우저로 전송시켜줌
    }

}
