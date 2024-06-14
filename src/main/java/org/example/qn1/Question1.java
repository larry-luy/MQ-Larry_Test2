package org.example.qn1;

public class Question1 {
    public static void main(String[] args){
        System.out.println("Question 1: Briefly describe an immutable object & provide some examples.");

         /**
          *  Answer: Immutable object is an object that cant be modified after creation. Once the object is initiated, the fields in the object cant be changed.
          *  There is no setter method for immutable objects.

          *  Example: String Class
             The String class is a well-known immutable class in Java.
             Once a String object is created, it cannot be changed.
             Any modification on a String result in the creation of a new String object.
         * */
        String str1 = "hello";
        String str2 = str1;

        // Concatenating strings creates a new String object to concat to hello world
        str1 = str1 + " World";

        System.out.println("Example : ");
        System.out.println("str1: " + str1); // Output: str1: Hello World
        System.out.println("str2: " + str2); // Output: str2: Hello



    }

}
