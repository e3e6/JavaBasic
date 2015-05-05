package com.sourceit.java.basic.Lesson11;

import java.util.Arrays;

public class Generics <T>{
	T t;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] intArr = {10, 20,30, 40};
//		String[] strArr = {"10", "20","30", "40"};
//		MySuperClass[] myArr = {new MySuperClass(), new MySuperClass()};
		
		Integer a = Integer.MAX_VALUE/2;
		Integer b = Integer.MAX_VALUE/2;
		
		Long c = 2147483647l  + 9223372036854775807l  ;
		NewBoxPrinter.fillArray(intArr, c);
		
		
		
		
//		NewBoxPrinter. <String>fillArray(args, args[1]);
		
		
//		NewBoxPrinter.<String>fillArray(strArr, "aa");
//		NewBoxPrinter.fillArray(myArr, new MySuperClass());
//		
		System.out.println(Arrays.asList(intArr));
//		System.out.println(Arrays.asList(strArr));
	}

}
class MySuperClass {
	
}
class NewBoxPrinter {
    private Object val;
 
    public NewBoxPrinter(Object arg) {
        val = arg;
    }

    public Object getValue() {
        return val;
    }
    
    public static <T> void fillArray(T[] array, T val){
        for(int i = 0; i < array.length; i++){
            array[i] = val;
        }
    }
    

//    public static <T> void fillArray(T[] array, T val){
//        for(int i = 0; i < array.length; i++){
//            array[i] = val;
//        }
//    }
}
