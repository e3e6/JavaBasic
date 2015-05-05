package com.sourceit.java.basic.Lesson11;

public class BoxPrinter<T, Q> { 
    private T val; 
    private Q var2;
 
    public BoxPrinter(T arg, Q secondArg) { 
        val = arg; 
    } 
 
    public T getValue() { 
        return val; 
    } 
    
    public Q getValue2() { 
        return var2; 
    } 
    
    public void print(){
    	System.out.println("Class = " + val.getClass());
    }

    
    public static void main(String[] args) { 
        BoxPrinter<Integer, String> value1 = new BoxPrinter<Integer, String>(10, "10"); 
        value1.print();
        Integer intValue1 = value1.getValue();
        System.out.println(intValue1); 
 
        BoxPrinter<String, Integer> value2 = new BoxPrinter<>("12", 10); 
        String intValue2 = value2.getValue();
        value2.print();
        System.out.println(intValue2); 
    } 
} 