package com.spring.domain;



public class Quest {
    private String description;

    public Quest(String description) {
        this.description = description;
    }
    public String toString(){
        return description;
    }
}
