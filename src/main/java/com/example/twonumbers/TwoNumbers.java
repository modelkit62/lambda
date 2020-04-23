package com.example.twonumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumbers{
    public static void main(String[] args){
        int[] array = new int[] {2,3,7,4,8};
        int target = 7;
        int[] mapping = mapping(array, target);
        System.out.println(Arrays.toString(mapping));
    }

    private static int[] mapping(int[] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int eureka = target - numbers[i];
            if(map.containsKey(eureka)){
                return new int[] {i, map.get(eureka)};
            }
            map.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }
}
