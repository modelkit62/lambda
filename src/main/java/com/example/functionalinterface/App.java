package com.example.functionalinterface;

public class App {

    public static void main(String[] args) {

        iApp.methodStatic(); // straightforward call!

        iApp iapp = (a, b) -> { return (a + b); }; // way to implement an interface (its method), possible just without the "return", just the operation

        System.out.println(iapp.myMethod(2, 2));
        iapp.methodDefault();

        Implementation implementation = new Implementation();
        System.out.println(implementation.myMethod(5, 3));


        // iApp appps = ClasePuente::new; watch out this could be if method returns a ClasePuente type insteadof an int

    }

    static class Implementation implements iApp {
        @Override
        public int myMethod(int a, int b) {
            return a - b;
        }
    }
}
