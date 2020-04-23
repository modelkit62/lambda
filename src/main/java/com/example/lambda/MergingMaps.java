package com.example.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingMaps {

    public static void main(String[] args) throws IOException {

        List<Person_2> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
              new InputStreamReader(
                  MergingMaps.class.getResourceAsStream("/people_2.txt")));

              Stream<String> stream = reader.lines();
        ) {

            stream.map(line -> {
                String[] s = line.split(" ");
                Person_2 p = new Person_2(
                        s[0].trim(),
                        Integer.parseInt(s[1]),
                        s[2].trim()
                );
                persons.add(p);
                return p;
            })
                    .forEach(System.out::println);


        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        persons.forEach(System.out::println);

        List<Person_2> list1 = persons.subList(1, 4); // tiene que haber 4 personas en people_2.txt
        List<Person_2> list2 = persons.subList(4, persons.size());

        Map<Integer, List<Person_2>> map1 = mapByAge(list1);
        System.out.println("Map 1");
        map1.forEach((age, list) -> System.out.println(age + " -> " + list));

        Map<Integer, List<Person_2>> map2 = mapByAge(list2);
        System.out.println("Map 2");
        map2.forEach((age, list) -> System.out.println(age + " -> " + list));

        map2.entrySet().stream()
                .forEach(
                        entry ->
                                map1.merge(
                                        entry.getKey(),
                                        entry.getValue(),
                                        (l1, l2) -> {
                                            l1.addAll(l2);
                                            return l1;
                                        }
                                )
                );
        System.out.println("Map 1 merged");
        map1.forEach((age, list) -> System.out.println(age + " -> " + list));

    }

    private static Map<Integer, List<Person_2>> mapByAge(List<Person_2> list) {
        Map<Integer, List<Person_2>> map =
                list.stream().collect(
                        Collectors.groupingBy(
                                Person_2::getAge
                        )
                );
        return map;
    }





}
