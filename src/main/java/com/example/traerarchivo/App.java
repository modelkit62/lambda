package com.example.traerarchivo;

import org.springframework.core.io.ClassPathResource;

import java.io.FileReader;
import java.io.IOException;

public class App {


    public static void main(String[] args) throws IOException {
        getContent();
    }


    private static void getContent() throws IOException {
        try(FileReader fileReader = new FileReader(new ClassPathResource("/people.txt").getFile())) {

           int puntero;
           while( ( puntero = fileReader.read() ) != -1) {
               System.out.print((char)puntero);
           }
        }
    }
}
