package com.example.claseinternainicializacion;

class ClaseExterna {
    //Miembro estático
    static int externo_x = 10;
    //Miembro de instancia
    int externo_y = 20;
    //Miembro privado
    private int externo_privado = 30;

    class ClaseInterna {
        void mostrar() {
            //Puede acceder al miembro estático de la clase externa
            System.out.println("externo_x: " + externo_x);
            //Puede acceder a un miembro no estático de la clase externa
            System.out.println("externo_y: " + externo_y);

            //Puede acceder a mostrar un miembro privado de la clase externa
            System.out.println("externo_privado: " + externo_privado);
        }
    }
}

class ClaseInternaDemo {
    public static void main(String[] args) {
        //Accediendo a la clase interna
        ClaseExterna objetoExterno = new ClaseExterna();

        ClaseExterna.ClaseInterna objetoInterno = objetoExterno.new ClaseInterna();
        objetoInterno.mostrar();
    }
}