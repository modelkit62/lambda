package com.example.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuildingBiMap {

    public static void main(String[] args) {
        
        List<Person_2> people = new ArrayList<>();
        
        try (
            BufferedReader reader = 
                new BufferedReader(
                    new InputStreamReader(
                        BuildingBiMap.class.getResourceAsStream("/people_2.txt")));

            Stream<String> stream = reader.lines();
        ) {

            stream.map(line -> {
                    String[] s = line.split(" ");
                    Person_2 p = new Person_2(s[0].trim(), Integer.parseInt(s[1]), s[2].trim());
                    people.add(p);
                    return p;
                })
                .forEach(System.out::println);
                
            
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        
        people.forEach(System.out::println);
        
        Map<Integer, List<Person_2>> map =
                people.stream().collect(
                        Collectors.groupingBy(
                                Person_2::getAge
                        )
                );
        
        map.forEach((age, list) -> System.out.println(age + " -> " + list));
        
        Map<Integer, Map<String, List<Person_2>>> bimap =
                new HashMap<>();
        
        people.forEach(
                person ->
                bimap.computeIfAbsent(
                        person.getAge(), 
                        HashMap::new
                ).merge(
                        person.getGender(), 
                        new ArrayList<>(Arrays.asList(person)), 
                        (l1, l2) -> {
                            l1.addAll(l2);
                            return l1;
                        }
                )
        );
        
        System.out.println("Bimap : ");
        bimap.forEach(
                (age, m) -> System.out.println(age + " -> " + m)
        );
    }        
}
