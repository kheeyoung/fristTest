package com.example.fristTest.dto;

import com.example.fristTest.entity.UserInfo;

public class SignInForm {

    private String ID;
    private String PW;
    private String NAME;

    public SignInForm(String ID, String PW, String NAME) {
        this.ID = ID;
        this.PW= PW;
        this.NAME=NAME;
    }

    @Override
    public String toString() {
        return "SignInForm{" +

                "ID='" + ID + '\'' +
                ", PW='" + PW + '\'' +
                ", NAME='" + NAME + '\'' +
                '}';
    }

    public UserInfo toEntity() {
        return new UserInfo(null,ID,PW,NAME);
    }
}
