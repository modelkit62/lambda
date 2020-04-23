package com.example.io;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

    private static final String FILE = "C:\\Users\\dr074\\workspace\\lambda\\src\\main\\resources\\myjson.json";


    public static void main(String[] args) throws IOException, ParseException {

        Object obj = new JSONParser().parse(new FileReader(FILE));
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;
        System.out.println(jo.toJSONString());
        System.out.println(jo.toString());


    }


}
