package org.example.qn3;

import java.util.*;

public class Question3 {


    public static void main(String []args){
        //    Question 3: Briefly explain the differences between these collections (SET, LIST & MAP) and
        //    provide examples of classes that implement each of these collection interfaces respectively.


        //Set is a collection that does not allow duplicates
        //Only contains unique values and does not have order
        System.out.println("Question 3: ");

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // This will not add another "apple" to the set

        System.out.println("Set Result: " + set);


        //A List is an ordered collection that can contain duplicate values.
        // Can access items by their position (index) in the list.
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("apple");

        System.out.println("List Result: " + list);



        // Map is an object that maps keys to values.
        // A map cannot contain duplicate keys, and each key can map to only one value hence it is unique.
        // Example like a directory where you look up a person's name (key) to find their phone number

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1); //this will be remove due to duplicate
        map.put("banana", 2);
        map.put("apple", 3);

        System.out.println("Map Result: " + map);




    }
}
