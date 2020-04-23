package com.example.misc;

import java.util.*;

public class App {

    List<String> stringList;

    public static void main(String[] args) {
        App app = new App();
        app.method_2();

    }

    public void method_1(){
        // stringList = Arrays.asList("One", "Two", "three"); UnsupportedOperationException
        stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()){

            if (iterator.next().equalsIgnoreCase("One")) {
                iterator.remove();

            }
        }
        stringList.forEach(x -> System.out.println(x));
    }

    public void method_2(){
        stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        final ListIterator<String> listIterator = stringList.listIterator();
        while(listIterator.hasNext()) {
            String nextWithIndex = stringList.get(listIterator.nextIndex());
            System.out.println("1 " + nextWithIndex);
            String next = listIterator.next();
            if("one".equals(next)) {
                listIterator.set("four");
            }
        }
        listIterator.add("five");
        while(listIterator.hasPrevious()) {
            String previousWithIndex = stringList.get(listIterator.previousIndex());
            System.out.println("2 " + previousWithIndex);
            String previous = listIterator.previous();
            System.out.println("3 " + previous);
        }
    }




}
