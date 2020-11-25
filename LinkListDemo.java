/*
  
    Programmed by: Ramim Hossain
    Contact: https://ramimhossain.com/
*/



package Ramim_Apps_Ltd.company.ff;

import java.util.LinkedList;

public class LinkListDemo {

    public static void main(String[] args) {
        LinkedList<String> country_name = new LinkedList<>();


        country_name.add("Bangladesh");
        country_name.add("Afghanistan");
        country_name.add("India ");
        country_name.add("Nepal");
        country_name.add("Pakistan");

        //for two element pass
        country_name.add(4,"London");

        //for add first data insert
        country_name.addFirst("Uk");
        // for add first data insert
        country_name.addLast("Japan");


        //...for remove index or element
        country_name.remove("Japan");
        country_name.remove(2);
        country_name.removeFirst();
        country_name.removeLast();



        for (String country : country_name) {
            System.out.println(country);
        }
       //for  linkedlist size print
        System.out.println("Size of linklist =" + country_name.size());

        System.out.println("First element :"+country_name.getFirst());
        System.out.println("Last element :"+country_name.getLast());



        //......for data clear

        country_name.clear();
        System.out.println(country_name);


    }
}
