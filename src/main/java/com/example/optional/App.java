package com.example.optional;

import java.util.Optional;

public class App {

    private void ofNullableTest(){
        String nullName = "null";
        String name = Optional.ofNullable("nullName").orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }

    public boolean isInRange1(Modem modem){

        boolean flag = false;

        if(modem != null && modem.getPrice() != null && (modem.getPrice() >= 10 && modem.getPrice() <= 15)){
            flag = true;
        }

        return flag;
    }

    public boolean isInRange2(Modem modem){
       return Optional.ofNullable(modem).map(p -> p.getPrice())
                .filter(p -> p >= 10).filter(p -> p <= 15)
                .isPresent();
    }



    public static void main(String[] args) {
        App app = new App();
        app.ofNullableTest();
        Modem modem = new Modem(11.02d);
        System.out.println(app.isInRange1(modem));
        System.out.println(app.isInRange2(null));

    }



    static class Modem{
        private Double price;

        public Modem(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return price;
        }

        /*public void setPrice(Double price) {
            this.price = price;
        }*/
    }


}
