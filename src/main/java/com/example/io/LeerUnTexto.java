package com.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class LeerUnTexto {

    private static final String FILENAME = "C:\\Users\\dr074\\workspace\\lambda\\src\\main\\resources\\miJson.json";
    private static final String FILENAME_ABREVIADO = "miJson.json";
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
