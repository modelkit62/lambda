package com.example.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localDate + " at: " + localTime);

        DateTimeFormatter dDay = DateTimeFormatter.ofPattern("dd--LL--yyyy");
        System.out.println(dDay.format(localDate));

        DateTimeFormatter dTime = DateTimeFormatter.ofPattern("HH::mm::ss");
        System.out.println(dTime.format(localTime));

        String armisticeDate = "1914-11-11";
        LocalDate aLD = LocalDate.parse(armisticeDate);
        DateTimeFormatter dArmistice = DateTimeFormatter.ofPattern("dd--LL--yyyy");
        System.out.println(dArmistice.format(aLD));
    }
}
