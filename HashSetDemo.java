package Ramim_Apps_Ltd.company.ff;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String > fruitsName = new HashSet<>();

     // value add ;
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Mango");
        fruitsName.add("Guava");


        System.out.println(fruitsName);
        //size
        System.out.println("size" + fruitsName.size());

        //remove
        fruitsName.remove("Apple");
        System.out.println(fruitsName);

        //clear
        fruitsName.clear();
        System.out.println(fruitsName);

        //IsEmpty
        boolean val = fruitsName.isEmpty();
        System.out.println(val);
    }
}
