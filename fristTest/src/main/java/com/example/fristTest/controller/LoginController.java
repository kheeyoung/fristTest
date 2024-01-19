package com.example.fristTest.controller;

import com.example.fristTest.dto.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/Login")
    public String Login(){
        return "/Login";
    }

    @PostMapping("/controller/LoginController")
    public String createLogin(LoginForm loginForm){
        System.out.println(loginForm.toString());
        return "";
    }
}
