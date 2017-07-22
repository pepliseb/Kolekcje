package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Oskar");
        listOfNames.add("Wojtek");
        listOfNames.add("Woj");

        if (listOfNames.contains("oskar")){
            System.out.println("Istnieje!");
        } else
        {
            System.out.println("nie");
        }
        System.out.println(listOfNames);

        listOfNames.remove( 0);
        System.out.println(listOfNames);
        listOfNames.indexOf("Wojtek");
        System.out.println(listOfNames.indexOf("Wojtek"));
        listOfNames.lastIndexOf("Wojtek");
        System.out.println(listOfNames);

        Iterator<String> iterator  = listOfNames.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
