package com.example.jsonfromfile;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {

    ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        App app = new App();
        // app.jsonFronFile();
        app.jsonToFile();
    }

    private void jsonFronFile() throws IOException {
        final Person person = objectMapper.readValue(new File("C:\\Users\\Daniel\\Downloads\\lambda\\src\\main\\resources\\miJson.json"), Person.class);
        System.out.println(person.getName());
    }

    private void jsonToFile() throws IOException {
        Person person = new Person("Alan", "Smith");
        System.out.println(person.getName());
        final String s = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(s);

    }

}
