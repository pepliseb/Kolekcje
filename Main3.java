package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Oskar");
        names.add("1234");
        names.add("Oskar3");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
