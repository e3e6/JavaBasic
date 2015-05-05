package com.sourceit.java.basic.Lesson11;

public class BoxPrinter { 
    private Object val; 
 
    public BoxPrinter(Object arg) { 
        val = arg; 
    } 
 
    public Object getValue() { 
        return val; 
    } 

    
    public static void main(String[] args) { 
        BoxPrinter value1 = new BoxPrinter(10); 
        Integer intValue1 = (Integer) value1.getValue();
        System.out.println(intValue1); 
 
        BoxPrinter value2 = new BoxPrinter("12"); 
        Integer intValue2 = (Integer) value2.getValue();
        System.out.println(intValue2); 
    } 
} 