package com.spring.domain;


public class Knight {

    private String name;
    private int age;
    private Quest quest;



    public Knight() {
        this.name = "Lancelot";
        this.age = 29;

    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Knight knight = (Knight) o;

        return age == knight.age;
    }

    @Override
    public int hashCode() {
        return age;
    }


    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }
        public void setAge(int age){
            this.age = age;
        }

    public String toString(){
        return " Rycerz o imeniu " + " " + name + "(" + age + ")" + "Ma za zadanie:" + " " + quest;
    }
}
