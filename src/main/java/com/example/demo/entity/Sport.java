package com.example.demo.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Sport {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private Integer stepNumbers;

    public Sport(String account, Integer stepNumbers) {
        this.account = account;
        this.stepNumbers = stepNumbers;
    }

    public Sport() {
    }
}