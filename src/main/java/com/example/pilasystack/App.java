package com.example.pilasystack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class App {

    public static void main(String[] args) {

        Stack<String> list = new Stack<>();
        list.push("uno");
        list.add("tres");
        System.out.println(list.peek());
        list.push("dos");
        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list.peek());
        list.forEach(s-> System.out.print(s+" "));

    }
}
