package com.example.createobjects;

class Worker {
    // ...
    void pay() {
        System.out.println("I've received the money " + this.getClass().getSimpleName());
    }
}

class Permanent extends Worker{}
class ZeroHoursContracted extends Worker{}

public class App{

    static Worker[] workers;

    private void runDemo(){
        workers = new Worker[]{new Permanent(), new ZeroHoursContracted()};
        demo(workers);
     }

    private void demo(Worker[] workers) {
        for (Worker w : workers){
            w.pay();
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.runDemo();
        try {
            assert workers.length == 3 : "La has jodido!";
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ble Bla");
    }

}
