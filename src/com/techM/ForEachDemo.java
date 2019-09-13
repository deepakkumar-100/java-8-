package com.techM;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String args[]) {

        List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);
        System.out.println("Printing elements of list using forEach method with Stream : ");
        listOfPrimes.stream().forEach(System.out::println);
        System.out.println("Printing elements of list using forEach method with parallelStream : ");
        listOfPrimes.parallelStream().forEachOrdered(i -> System.out.println(i * 2));


    }

}
