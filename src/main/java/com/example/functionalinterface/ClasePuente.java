package com.example.functionalinterface;

public class ClasePuente {

    private int age;
    private int number;

    public ClasePuente() {
    }

    public ClasePuente(int age, int number) {
        this.age = age;
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public ClasePuente setAge(int age) {
        this.age = age;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public ClasePuente setNumber(int number) {
        this.number = number;
        return this;
    }
}
