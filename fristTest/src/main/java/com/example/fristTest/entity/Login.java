package com.example.fristTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity //DB가 인식하게 함
public class Login {
    @Id
    @GeneratedValue
    private Long idnum;

    //column 선언
    @Column
    private String ID;
    @Column
    private String PW;

    public Login(Long idnum,String ID, String PW){
        this.idnum=idnum;
        this.ID=ID;
        this.PW=PW;
    }

    @Override
    public String toString() {
        return "Login{" +
                "idnum=" + idnum +
                ", ID='" + ID + '\'' +
                ", PW='" + PW + '\'' +
                '}';
    }
}
