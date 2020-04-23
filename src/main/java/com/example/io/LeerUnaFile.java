package com.example.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class LeerUnaFile {

    public static void main(String[] args) throws IOException {

        LeerUnaFile main = new LeerUnaFile();

        ClassLoader classLoader = main.getClass().getClassLoader();

        URL resource = classLoader.getResource("database.properties");

        File result = new File(resource.getFile());

        try (FileReader reader = new FileReader(result);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
