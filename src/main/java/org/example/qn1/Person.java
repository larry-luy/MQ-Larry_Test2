package org.example.qn1;


/** This is an example of an immutable object */
public final class Person {
    private final String name;
    private final int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
