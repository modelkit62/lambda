package com.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        String string = "four";

        String[] array = {"uno", "dos", "tres", string};
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1;
            }
        });
        System.out.println(list);



    }


}
