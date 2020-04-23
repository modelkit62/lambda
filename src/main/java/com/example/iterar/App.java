package com.example.iterar;

import java.util.*;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
       /* Collection<String> c = Arrays.asList("One", "Two", "Three");
        final List<String> collect = c.stream().map(String::toUpperCase).collect(Collectors.toList());*/

        Map<String, String> map = new HashMap<String, String>();
        map.put("Adobe", "Mountain View, CA");
        map.put("IBM", "White Plains, NY");
        map.put("Sun", "Mountain View, CA");
        map.put("Learning Tree", "Los Angeles, CA");

        TreeMap<String, String> sorted = new TreeMap<>(map); // para ordenarlo por key

        Iterator<String> it = sorted.keySet().iterator();
        while(it.hasNext()) {
            String key = it.next();
            if(key.equals("Sun")) {
                it.remove();
                continue;
            }
            System.out.println("Company " + key + "; " + "Address " + map.get(key));
        }


        // Setup the Preferences for this application, by class.
        Preferences prefs = Preferences.userNodeForPackage(App.class);
        // Retrieve some preferences previously stored, with defaults in case
        // this is the first run.
        String text = prefs.get("textFontName", "lucida-bright");
        String display = prefs.get("displayFontName", "lucida-blackletter");
        System.out.println(text);
        System.out.println(display);
        // Assume the user chose new preference values: Store them back.
        prefs.put("textFontName", "times-roman");
        prefs.put("displayFontName", "helvetica");
        // System.out.println(display);
        System.out.println(text);




    }


}
