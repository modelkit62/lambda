package com.example.properties;

import java.util.Properties;

public class App {

    public static void main(String[] argv) throws java.io.IOException {

        Properties appProps = new Properties();
        appProps.setProperty("name", "NewAppName"); // update an old value
        appProps.hashCode();
        System.out.println(appProps.getProperty("name"));

    }
}
