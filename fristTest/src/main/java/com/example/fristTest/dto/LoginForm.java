package com.example.fristTest.dto;

import com.example.fristTest.entity.Login;

public class LoginForm {

    private String ID;
    private String PW;

    public LoginForm(String ID,String PW) {
        this.ID = ID;
        this.PW= PW;
    }

    @Override
    public String toString() {
        return "LoginForm{" +

                "ID='" + ID + '\'' +
                ", PW='" + PW + '\'' +
                '}';
    }

    public Login toEntity() {
        return new Login(null,ID,PW);
    }
}
