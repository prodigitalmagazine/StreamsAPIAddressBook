package com.addressbook;

import java.util.stream.Stream;

public class AddressBookUC8 {

    public static void main(String[] args)
    {


        Stream<String> stream = Stream.of("Nagesh", "Mahesh",
                "Raghu", "Pinkal","Priresh");


        stream.filter(str -> str.endsWith("h"))
                .forEach(System.out::println);

    }
}
