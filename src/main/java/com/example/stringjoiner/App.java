package com.example.stringjoiner;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.StringJoiner;

public class App {
    public static void main(String[] args) {

        // StringJoiner
        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");
        stringJoiner.add("one").add("two");
        stringJoiner.merge(stringJoiner);
        System.out.println(stringJoiner.toString());

        StringUtils stringUtils = new StringUtils(); // asi no funciona son todo metodos estaticos
        String[] array = new String[] { "a", "b", "c" };
        String joined = "mi joined is:";
        System.out.println(joined + " " + StringUtils.join(array, ","));

        String[] strArray = new String[] { "a", "b", "c" };

        String joinedString = StringUtils.join(strArray);
        System.out.println(joinedString);

        String joinedString2 = StringUtils.join(strArray, ", ");
        System.out.println(joinedString2);

    }
}
