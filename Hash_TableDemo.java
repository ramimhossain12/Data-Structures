package Ramim_Apps_Ltd.company.ff;

import java.util.Hashtable;
import java.util.Map;

public class Hash_TableDemo {

    public static void main(String[] args) {
        Hashtable<Integer,String > n = new Hashtable<>();
        n.put(100,"A");
        n.put(102,"v");
        n.put(101,"b");
        n.put(103,"vc");

        for(Map.Entry m:n.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

            //for remove
            n.remove(100);
            System.out.println("After remove"+n);

            //for getOrDefault()
            System.out.println(n.getOrDefault(101, "Not Found"));
            System.out.println(n.getOrDefault(105, "Not Found"));

            //for putIfAbsent()
            n.putIfAbsent(104,"Gaurav");
            System.out.println("Updated Map: "+n);
            //Returns the current value, as the specified pair already exist
            n.putIfAbsent(101,"Vijay");
            System.out.println("Updated Map: "+n);
        }
    }
}



//RealLife Example

import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class HashtableExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,Book> map=new Hashtable<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for(Map.Entry<Integer, Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}    