package com.example.string;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App1 {

    static List<Character> lista = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            lista.add('c');
        }
        List<Character> collect = lista.stream().peek(System.out::print).collect(Collectors.toList());
        System.out.println(" " +collect.size());

        String s1 = collect.toString();
        System.out.println(s1);
        String substring = s1.substring(1, 3 * collect.size() - 1);
        String s = substring.replaceAll(", ", "-");
        System.out.println(s);


        /*String s = s1.substring(1, 3 * 5).replace(", ", " ").replace("]", "");
        System.out.println(s);
        String s2 = s.substring(0, 1 * 9).replaceAll(" ", ", ");
        System.out.println(s2);*/

        // convert list of characters in string
        List<Character> characterList = Arrays.asList('a','b','c');
        List<String> collect1 = characterList.stream().map(z -> z.toString()).collect(Collectors.toList());
        collect1.forEach(System.out::print);












    }



}
