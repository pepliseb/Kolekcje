package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main4 {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Oskar");
        queue.add("Czesc");
        queue.add("AkademiaKodu");

//        queue.remove();
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
