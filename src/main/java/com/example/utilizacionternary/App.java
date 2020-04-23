package com.example.utilizacionternary;

public class App {
    public static void main(String[] argv) {
        report(0);
        report(1);
        report(2);
    }

    /**
     * report -- using conditional operator
     */
    public static void report(int n) {
        System.out.println("We used " + n + " item" + (n == 1 ? "" : "s"));
    }

    /*if(n==1)
        System.out.println("We used "+n +" item");
    else
        System.out.println("We used "+n +" items");
    */

}
