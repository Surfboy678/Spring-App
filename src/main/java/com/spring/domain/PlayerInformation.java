package com.spring.domain;


import org.springframework.stereotype.Component;

@Component
public class PlayerInformation {

    public int gold = 0;
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
