package com.example.downcasting;

public class B extends A {

    public static void resolution(A a){
        if(a instanceof B){
            ((B) a).doStuff();
            System.out.println(a.getClass().getSimpleName());
        }
    }

    public void doStuff(){
        System.out.println("b is and instance of A");
    }

    public static void main(String[] args) {
        A a = new B();
        resolution(a);
    }

}
