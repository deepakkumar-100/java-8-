package com.techM.consumer;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {
    static void ShowDetails(String name, Integer age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        // Referring method
        BiConsumer<String, Integer> biCon = BiConsumerInterfaceExample::ShowDetails;
        biCon.accept("Rama", 20);
        biCon.accept("Shyam", 25);
        //Using Lambda Expression
        BiConsumer<String, Integer> biCon2 = (name, age) ->  System.out.println(name+" "+age);
        biCon2.accept("Deepak",29);

    }
}