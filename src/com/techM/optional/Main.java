package com.techM.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String args[]){
        Address bharatAddress = new Address("Kolte patil","Pune","India",400011);

        Person person1 = new Person("Bharat",Optional.of(bharatAddress),105);
        Person person2 = new Person("Deepak",Optional.empty(),108);
        Person person3 = new Person("Bunty",Optional.empty(),110);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personList.stream()
                .forEach(p -> System.out.println(p.name() + " " + p.address() + " " + p.phone()));

    }

}
