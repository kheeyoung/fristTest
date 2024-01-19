package com.example.fristTest.controller;

import com.example.fristTest.dto.LoginForm;
import com.example.fristTest.entity.Login;
import com.example.fristTest.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired //객체에 자동 연결 (저장소)
    private LoginRepository LoginRepository;

    @GetMapping("/Login")
    public String Login(){
        return "/Login";
    }

    @PostMapping("/controller/LoginController")
    public String createLogin(LoginForm loginForm){
        //System.out.println(loginForm.toString());

        //DTO 변환 (->Entity)
        Login login = loginForm.toEntity();
        System.out.println(login.toString());

        //Repository에게 저장하게 함 (Entity를 DB에 저장)
        Login input =LoginRepository.save(login);
        System.out.println(input.toString());
        return "";
    }
}
