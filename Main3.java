package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Oskar");
        names.add("1234");
        names.add("Oskar");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
