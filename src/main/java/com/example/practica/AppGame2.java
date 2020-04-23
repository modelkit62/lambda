package com.example.practica;

public class AppGame2 {

    int ancho;
    int alto;
    int[][] tablero;

    AppGame2(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
        tablero = new int[ancho][alto];
    }

    private void imprime() {
        System.out.println("============");
        for(int x = 0; x < ancho; x++){
           String linea = "|";
            for(int y = 0; y < alto ; y++) {
                if(this.tablero[x][y] == 0){
                    linea += ".";
                } else {
                    linea += "*";
                }
            }
            linea += "|";
            System.out.println(linea);
        }
        System.out.println("============");
    }

    public void setVivo(int x, int y){
        this.tablero[x][y] = 1;
    }
    public void setMuerto(int x, int y){
        this.tablero[x][y] = 0;
    }


    public int getVecinitosVivos(int x, int y){

        int contador = 0;

        contador += esFrontera(x-1,y-1);
        contador += esFrontera(x-1,y);
        contador += esFrontera(x-1,y+1);

        contador += esFrontera(x,y-1);
        contador += esFrontera(x,y+1);

        contador += esFrontera(x+1,y-1);
        contador += esFrontera(x+1,y);
        contador += esFrontera(x+1,y+1);

        return contador;
    }

    private int esFrontera(int x, int y) {
        if(x<0 || x>ancho-1)
            return 0;
        if(y<0 || y>ancho-1)
            return 0;
        return this.tablero[x][y];

    }

    public static void main(String[] args) {
        AppGame2 app = new AppGame2(6, 10);
        app.setVivo(2, 3);
        app.setVivo(2, 4);
        app.setVivo(2, 5);

        app.imprime();

        app.mutacion();

        System.out.println(app.getVecinitosVivos(3, 3));

        app.imprime();

    }

    private void mutacion() {

        int[][] nuevoTablero = new int[ancho][alto];

        for(int x = 0; x < ancho; x++) {
            for(int y = 0; y < alto ; y++) {

                final int vecinitosVivos = getVecinitosVivos(x, y);

                if(esFrontera(x, y) == 1) {
                    if(vecinitosVivos == 2 || vecinitosVivos == 3){
                        nuevoTablero[x][y] = 1;
                    } else if (vecinitosVivos < 2) {
                        nuevoTablero[x][y] = 0;
                    } else if (vecinitosVivos > 3) {
                        nuevoTablero[x][y] = 0;
                    }
                } else {
                    if(vecinitosVivos == 3) {
                        nuevoTablero[x][y] = 1;
                    }
                }
            }
        }
        this.tablero = nuevoTablero;
    }
}
