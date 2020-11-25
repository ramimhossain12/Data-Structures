
/*
  
    Programmed by: Ramim Hossain
    Contact: https://ramimhossain.com/
*/


package Ramim_Apps_Ltd.company.ff;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);


        //remove
        people.remove("Steve");

        //  for clear
        people.clear();

        // for size
        people.size();

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
