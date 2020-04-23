package com.example.collection5wildcard.unbounded;


import com.example.collection5wildcard.bounded.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedUsage {
    public static void main(String[] args) throws ClassNotFoundException {

        Object[] array = new String[1];
        // array[0] = new Object(); TIRA UNA ARRAYSTOREEXCEPTION!!!
        array[0] = new String("Hello");
        System.out.println(Arrays.toString(array));

        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        objects.add(new Person("Don Draper", 89));
        System.out.println(objects);

        // Its only safe to add null to a List<?>
        List<?> wildcards = new ArrayList<>();
        wildcards.add(null);
        System.out.println(wildcards);
    }

}
