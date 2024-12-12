package com.authentication.basic.auth;

import java.util.Comparator;

class Person implements Comparable<Person> {
    private String name;
    private int age;

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

    // Implement the compareTo method to compare by age
    @Override
    public int compareTo(Person other) {
        if(this.age==other.age)
        return 0;
        else if(this.age>other.age)
        return 1;
        else
        return -1;

    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
