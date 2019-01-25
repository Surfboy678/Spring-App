package com.spring.domain;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PlayerInformation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private int gold = 0;

    public int silver = 0;


    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }
}
