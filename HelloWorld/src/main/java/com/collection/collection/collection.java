package com.collection.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collection {
    public static void main(String[] args) {
        task1();
        task2();

        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape"));
        printUniqueWords(words);

        List<String> strings = new ArrayList<>(List.of("one", "two", "two", "three", "three", "three"));
        printDuplicateCounts(strings);
    }
    //Задание 1
    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for ( int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num + " четное число");
                
            }
        }
    }
    //Задание 2
    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Integer prevNum = null;
        for ( int num : nums) {
            if (num % 2 != 0 && (prevNum == null || num != prevNum.intValue())) {
                System.out.println(num + " нечетное число");
                prevNum = num;
                }
        }
    }

    //Задание 3
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }


    public static void printDuplicateCounts(List<String> strings) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
