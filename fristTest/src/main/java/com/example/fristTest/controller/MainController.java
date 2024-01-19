package com.example.fristTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping("/main")
    public String main(Model model){
        model.addAttribute("UserName","ghgh가가");

        return "main"; //templates/main.mustache 를 브라우저로 전송시켜줌
    }

}
