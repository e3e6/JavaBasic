package com.sourceit.exercise;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.sourceit.exercise.IntArrays;

/**
 * Test class of {@link IntArrays}
 *
 */
public class IntArraysTest {
	
	public static final int[] values = {111, 100500, 666, 777, -8, 6 , 7 , 8, 9 ,10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20, 21, 22};
	public static final int[] empty = {};


	@Test
	public void arrayListTest() {
		performTest(new TestTest(), values);
		performTest(new TestTest(), empty);
	}
	
	
	@Test
	public void bohuslavskyi() {
//		performTest(new com.sourceit.java.basic.hometask7.bohuslavskyi.IntReal(), values);
//		performTest(new com.sourceit.java.basic.hometask7.bohuslavskyi.IntReal(), empty);
	}
	
	@Test
	public void Sungurov() {		
//		performTest(new com.sourceit.Sungurov.HT7.Start.MyArray(), values);
//		performTest(new com.sourceit.Sungurov.HT7.Start.MyArray(), empty);
	}
	
	@Test
	public void Pshen() {
//		performTest(new com.sourceit.javabasic.lesson7.serge.Exer().new MyArr(), values);
//		performTest(new com.sourceit.javabasic.lesson7.serge.Exer().new MyArr() , empty);
	}
	
	@Test
	public void Popazov() {
//		performTest(new com.sourceit.javabasic.lesson7.MyArrays(), values);
//		performTest(new com.sourceit.javabasic.lesson7.MyArrays(), empty);
	}
	
	@Test
	public void Polyakov() {
//		performTest(new defaultpackage.ArrayCheck(), values);
//		performTest(new defaultpackage.ArrayCheck(), empty);
	}
	
	@Test
	public void Petrenko() {
//		performTest(new com.petrenko.pr7.MyArrays(), values);
//		performTest(new com.petrenko.pr7.MyArrays(), empty);
	}
	
	@Test
	public void Meshcheriakov() {
//		performTest(new com.sourceit.javabasic.lesson7.meshcheriakov.MyArrays(), values);
//		performTest(new com.sourceit.javabasic.lesson7.meshcheriakov.MyArrays(), empty);
	}

	@Test
	public void Lesovaya() {
//		performTest(new com.sourceit.javabasic.lesson7.ArrayUpdate(), values);
//		performTest(new com.sourceit.javabasic.lesson7.ArrayUpdate(), empty);
	}
	
	/**
	 * Helper. To test the implementation with the specified values
	 * @param list implementation of IntArrays
	 * @param array values list
	 */
	private static void performTest(IntArrays list, int[] array){
		for(int i = 0; i < array.length; i++){
			list.add(array[i]);
			assertEquals(i+1, list.size());
		}
		
		assertEquals(array.length, list.size());
		
		if(array.length > 0){
			int index = new Random().nextInt(array.length-1);	
			assertEquals(array[index], list.get(index));
		}
	}
}

/**
 * Implementation with ArrayList inside 
 * @author alex
 *
 */
class TestTest implements IntArrays {
	private List<Integer> list = new ArrayList<Integer>();
	
	@Override
	public void add(int a) {
		list.add(a);
	}

	@Override
	public int get(int i) {
		return list.get(i);
	}

	@Override
	public int size() {
		return list.size();
	}
	
}