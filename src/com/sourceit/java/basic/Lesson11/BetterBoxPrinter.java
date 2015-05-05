package com.sourceit.java.basic.Lesson11;

public class BetterBoxPrinter<T> { 
    private T val; 
 
    public BetterBoxPrinter(T arg) { 
        val = arg; 
    } 
 
    public T getValue() { 
        return val; 
    } 

    
    public static void main(String[] args) {
        BetterBoxPrinter value1 = new BetterBoxPrinter(10); 
        Integer intValue1 = (Integer) value1.getValue();
        System.out.println(intValue1); 
 
        BetterBoxPrinter value2 = new BetterBoxPrinter("12"); 
        Integer intValue2 = (Integer) value2.getValue();
        System.out.println(intValue2); 
    } 
} 