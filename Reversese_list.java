package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Reversese_list {

    public static void main(String[] args) {

        LinkedList<String > list = new LinkedList<>();
        list.add("R");
        list.add("A");
        list.add("B");

        Iterator i = list.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
