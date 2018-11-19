package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String avatar;

    public User(String account, String password, String nickname, String avatar) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
    }

    public User() {
    }
}