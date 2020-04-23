package com.example.stringwork;

import java.util.StringTokenizer;

public class App {

    public static void main(String[] av) {
        StringTokenizer st = new StringTokenizer("Hello World");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens())
            System.out.println("Token: " + st.nextToken( ));
    }


}
