package com.example.optional;

import java.util.Optional;

public class App2 {

    public String getNombre(Persona persona){
        Optional<Optional<String>> s = Optional.ofNullable(persona).map(Persona::getNombre);
        String s1 = Optional.ofNullable(persona).flatMap(Persona::getNombre).get();
        return s1;
    }

    public static void main(String[] args) {
        App2 app2 = new App2();
        App2.Persona persona = app2.new Persona(Optional.of("Alan"));
        String nombre = app2.getNombre(persona);
        System.out.println(nombre);
    }

    class Persona{

        Optional<String> nombre;

        public Persona(Optional<String> nombre) {
            this.nombre = nombre;
        }

        public Optional<String> getNombre() {
            return nombre;
        }

        public void setNombre(Optional<String> nombre) {
            this.nombre = nombre;
        }
    }
}
