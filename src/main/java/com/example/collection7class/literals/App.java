package com.example.collection7class.literals;

public class App {
    public static void main(String[] args) {
        Injector injector = new Injector().with("Hello World");
        Logger logger = injector.newInstance(Logger.class);
        logger.log();
    }
}
