package com.example.hilos;

public class App_1 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from Thread " + this.getName().toString());
    }

    public static void main(String[] args) throws InterruptedException {
        App_1 app_1 = new App_1();
        App_1 app_2 = new App_1();
        app_1.setName("nombre 1");
        app_2.setName("nombre 2");
        app_1.start();
        Thread.sleep(3000);
        app_1.join();
        app_2.start();
        // app_2.join(2000);

    }

    @Override
    public String toString() {
        return "Este es el hijo " + this.getName().toString();
    }
}
