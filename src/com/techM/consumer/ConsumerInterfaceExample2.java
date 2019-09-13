package com.techM.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample2 {
    public void addList(List<Integer> integerList){
        int result = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("The summation of list value is : " + result);

    }
    public static  void main(String args[]){
        List<Integer> list = Arrays.asList(10,12,15,13,25,1000,14,24);
        Consumer<List<Integer>> consumer = new ConsumerInterfaceExample2()::addList;
        consumer.accept(list);
    }
}
