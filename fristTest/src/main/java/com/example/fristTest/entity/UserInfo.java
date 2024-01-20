package com.example.fristTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity //DB가 인식하게 함
public class UserInfo {
    @Id
    @GeneratedValue
    private Long idnum;

    //column 선언
    @Column
    private String ID;
    @Column
    private String PW;

    @Column
    private String NAME;

    public UserInfo(Long idnum, String ID, String PW, String NAME){
        this.idnum=idnum;
        this.ID=ID;
        this.PW=PW;
        this.NAME= NAME;
    }

    @Override
    public String toString() {
        return "SignIn{" +
                "idnum=" + idnum +
                ", ID='" + ID + '\'' +
                ", PW='" + PW + '\'' +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
