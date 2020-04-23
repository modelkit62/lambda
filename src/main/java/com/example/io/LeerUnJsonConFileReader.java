package com.example.io;

import java.io.*;
import java.net.URL;

public class LeerUnJsonConFileReader {


    public static void main(String[] args) throws IOException {
        LeerUnJsonConFileReader leerUnJsonConFileReader = new LeerUnJsonConFileReader();
        ClassLoader cl = leerUnJsonConFileReader.getClass().getClassLoader();
        URL file = cl.getResource("myJson.json");
        File resource = new File(file.getFile());
        try (BufferedReader reader = new BufferedReader(new FileReader(resource))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
