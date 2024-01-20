package com.example.fristTest.controller;

import com.example.fristTest.dto.SignInForm;
import com.example.fristTest.entity.UserInfo;
import com.example.fristTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignInController {
    @Autowired //객체에 자동 연결 (저장소)
    private UserRepository UserRepository;

    @GetMapping("/SignIn")
    public String SignIn(){
        return "/SignIn";
    }

    @PostMapping("/controller/SignInController")
    public String createSignIn(SignInForm signInForm){
        //System.out.println(SignInForm.toString());

        //DTO 변환 (->Entity)
        UserInfo userInfo = signInForm.toEntity();
        System.out.println(userInfo.toString());

        //Repository에게 저장하게 함 (Entity를 DB에 저장)
        UserInfo input = UserRepository.save(userInfo);
        System.out.println(input.toString());
        return "";
    }
}
