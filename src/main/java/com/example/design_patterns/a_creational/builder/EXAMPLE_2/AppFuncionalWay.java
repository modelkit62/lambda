package com.example.design_patterns.a_creational.builder.EXAMPLE_2;

public class AppFuncionalWay {

    String name;
    Integer age;

    AppFuncionalWay(){}

    AppFuncionalWay(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    class Builder{
        String name;
        Integer age;

        public Builder(){}

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public AppFuncionalWay build(){
            return new AppFuncionalWay(this);
        }
    }

    public static void main(String[] args) {

        /* SI BUILDER FUERA UNA CLASE STATIC
        AppFuncionalWay appFuncionalWay = new AppFuncionalWay.Builder().withName("Berns").withAge(21).build();
        System.out.println(appFuncionalWay.name+" "+appFuncionalWay.age);*/

        AppFuncionalWay appFuncionalWay = new AppFuncionalWay();
        AppFuncionalWay model = appFuncionalWay.new Builder().withName("xxx").withAge(22).build();
        System.out.println(model.name+" "+model.age);

    }
}
