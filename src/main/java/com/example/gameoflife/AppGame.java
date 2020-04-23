package com.example.gameoflife;

public class AppGame{

    int alto;
    int ancho;
    int[][] tablero;

    public AppGame(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
        this.tablero = new int[alto][ancho];
    }

    public void imprimeTablero(){
        System.out.println("==========");
        for(int y = 0; y < alto; y++){
            String line = "|";
            for(int x = 0; x < ancho; x++){
                if(this.tablero[y][x] == 0){ // RECORRO HORIZONTAL!!!
                    line += ".";
                } else{
                    line += "*";
                }
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println("==========");
    }

    public void setAlive(int y, int x){
        this.tablero[y][x] = 1;
    }

    public void setDead(int y, int x){
        this.tablero[y][x] = 0;
    }

    public int getVecinosVivos(int y, int x){
        int count = 0;

        count += esFrontera(y - 1, x - 1);
        count += esFrontera(y, x - 1);
        count += esFrontera(y + 1, x - 1);

        count += esFrontera(y - 1, x);
        count += esFrontera(y + 1, x);

        count += esFrontera(y - 1, x + 1);
        count += esFrontera(y, x + 1);
        count += esFrontera(y + 1, x + 1);

        return count;
    }

    public int esFrontera(int y, int x){
        if(y < 0 || y >= alto){
            return 0;
        }

        if(x < 0 || x >= ancho){
            return 0;
        }
        return this.tablero[y][x];
    }

    public void siguientePaso(){
        int[][] nuevoTablero = new int[alto][ancho];

        for(int y = 0; y < alto; y++){
            for(int x = 0; x < ancho; x++){
                int vecinosVivos = getVecinosVivos(y, x);

                if(esFrontera(y, x) == 1){
                    if(vecinosVivos < 2){
                        nuevoTablero[y][x] = 0;
                    } else if(vecinosVivos == 2 || vecinosVivos == 3){
                        nuevoTablero[y][x] = 1;
                    } else if(vecinosVivos > 3){
                        nuevoTablero[y][x] = 0;
                    }
                } else{
                    if(vecinosVivos == 3){
                        nuevoTablero[y][x] = 1;
                    }
                }
            }
        }
        this.tablero = nuevoTablero;
    }

    public static void main(String... args){
        AppGame appGame = new AppGame(6, 8);

        appGame.setAlive(2, 2);
        appGame.setAlive(2, 3);
        appGame.setAlive(2, 4);
        appGame.setAlive(3, 2);
        appGame.setAlive(3, 3);
        appGame.imprimeTablero();

        System.out.println(appGame.getVecinosVivos(2, 3));

        appGame.siguientePaso();

        appGame.imprimeTablero();

        System.out.println(appGame.getVecinosVivos(2, 3));

        appGame.siguientePaso();

        appGame.imprimeTablero();

        System.out.println(appGame.getVecinosVivos(2, 3));

    }
}
