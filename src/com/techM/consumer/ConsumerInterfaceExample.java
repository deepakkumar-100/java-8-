package com.techM.consumer;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    static void printMessage(String name){
        System.out.println("Hello "+name);
    }
     void printValue(int val){
        System.out.println(val);
    }

    public static void main(String[] args) {
        Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;
        consumer1.accept("Bharat kumar");

        /*Consumer<Integer> consumer2 = new ConsumerInterfaceExample()::printValue;
        consumer2.accept(10);*/

        Consumer<Integer> consumer2 = val-> System.out.println(val);
        consumer2.accept(100);
    }
    }
