package com.sourceit.java.basic.lesson26.tests;

import com.sourceit.java.basic.lesson26.exercise.Person;

public class PersonTest {

    public static void main(String[] args) 
    { 
        Person p = new Person("Judy", 20); 
        System.out.println(p.getName() + " is " + p.getAge() + " years old"); 
    } 
}
