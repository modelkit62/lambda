package com.example.classpath;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        /*final String property = System.getProperty("java.class.path");
        System.out.println("Mi class path: " + property);

        final Map<String, String> getenv = System.getenv();
        final Set<Map.Entry<String, String>> entries = getenv.entrySet();
        final Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/

        System.out.println("Mi variable path: " + System.getenv("USERNAME"));
        System.out.println("Mi variable path: " + System.getProperty("user.name"));
        System.out.println("Mi variable path: " + System.getProperty("mi.nombre"));


    }
}
