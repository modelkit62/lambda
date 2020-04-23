package com.example.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class App2 {

    public static void main(String[] args) {

        String s = new String("one,two,three");

        StringTokenizer tokenizer = new StringTokenizer(s, ",");

        List<String> stringList = new ArrayList<>();
        while (tokenizer.hasMoreElements()) {
            stringList.add(tokenizer.nextToken());
        }

        System.out.println(stringList);

        System.out.println(
                Collections.list(new StringTokenizer(s, ",")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList())
        );

        List<String> collect = Collections.list(new StringTokenizer(s, ",")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());

        System.out.println(collect.size());



    }



}
