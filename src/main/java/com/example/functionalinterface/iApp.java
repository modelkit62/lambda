package com.example.functionalinterface;

public interface iApp {
    int myMethod(int a, int b);
    // int myMethod_2(int a, int b); if declare a second method it's not a functional interface

    static void methodStatic(){
        System.out.println("From my static method!");;
    }

    default void methodDefault(){
        System.out.println("From my default method!");
    }
}
