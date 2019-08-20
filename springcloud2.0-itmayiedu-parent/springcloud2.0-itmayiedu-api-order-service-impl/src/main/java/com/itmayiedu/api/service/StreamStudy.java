package com.itmayiedu.api.service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author evanYang
 * @version 1.0
 * @date 08/20/2019 15:50
 */
public class StreamStudy {
    public static void main(String[] args) {
        /*List<String> strings = Arrays.asList("abc", "", "bc", "dfg", "abcd", "", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println(filtered.toString());*/
        //Demo1();
        //mapDemo();
        //streamFilter();
        //streamLimit();
        stramSorted();
    }

    public static void Demo1() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    public static void mapDemo() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> squaresList = numbers.stream().map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(squaresList.toString());
    }

    public static void streamFilter() {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "", "e", "");
        long count = strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println(count);
        ArrayList<Object> list = new ArrayList<>();
    }

    public static void streamLimit(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    public static void stramSorted(){
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

    }

}
