package com.sourceit.java.basic.Lesson11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * Alina
 * Anna
 * Artur M
 * Gutorov
 * Illia
 * Oleg
 * Ostroverh Mich
 * Ovcharenko
 * Pshen
 * Popazov (saifer)
 * Ovsiannikov Seg (serovdrug)
 * Bohuslavskiy Max
 *
 */
public class TextStatisticsTest {

	@Test
	public void ostroverhM(){
		com.sourceit.java.basic.ostmik.HT11.TextStatistics st = new com.sourceit.java.basic.ostmik.HT11.TextSt(TEXT);
		
		//words
//				assertEquals(words, st.words().size());
		//getCharCount
				assertEquals(SYMBOL_COUNT, st.getCharCount(SYMBOL));
		//getCharByCount
//				assertEquals(SYMBOL, st.getCharByCount(SYMBOL_COUNT));
		//getMostPopularCharCount
//				assertEquals(MOST_POPULAR_COUNT_SPACE, st.getMostPopularCharCount());
//				assertEquals(MOST_POPULAR_COUNT, st.getMostPopularCharCount());
				
//				assertEquals(MOST_POPULAR_CHAR_SPACE, st.getCharByCount( st.getMostPopularCharCount()));
		//getChars
//				assertEquals((Integer)st.getCharCount(SYMBOL), st.getChars().get(SYMBOL_STRING));
//				assertEquals(SYMBOL, st.getCharByCount(st.getChars().get(SYMBOL_STRING)));
	}
	
	@Test
	public void meshcheriakov(){
		com.sourceit.java.basic.meshcheriakov.ht12.textstatistics.model.TextStatistics st = 
				new com.sourceit.java.basic.meshcheriakov.ht12.textstatistics.MyTextStatistics(TEXT);
		
		//words
//				assertEquals(words, st.words().size());
		//getCharCount
				assertEquals(SYMBOL_COUNT, st.getCharCount(SYMBOL));
		//getCharByCount
				assertEquals(SYMBOL, st.getCharByCount(SYMBOL_COUNT));
		//getMostPopularCharCount
//				assertEquals(MOST_POPULAR_COUNT_SPACE, st.getMostPopularCharCount());
				assertEquals(MOST_POPULAR_COUNT, st.getMostPopularCharCount());
				
				assertEquals(MOST_POPULAR_CHAR, st.getCharByCount( st.getMostPopularCharCount()));
		//getChars
				assertEquals((Integer)st.getCharCount(SYMBOL), st.getChars().get(SYMBOL_STRING));
				assertEquals(SYMBOL, st.getCharByCount(st.getChars().get(SYMBOL_STRING)));
	}
	
	@Test
	public void alina(){
		com.sourceit.java.basic.petrenko.ht11.TextStatistics st = 
				new com.sourceit.java.basic.petrenko.ht11.TestStImplementation(TEXT);
		
		//words
//				assertEquals(words, st.words().size());
		//getCharCount
				assertEquals(SYMBOL_COUNT, st.getCharCount(SYMBOL));
		//getCharByCount
				assertEquals(SYMBOL, st.getCharByCount(SYMBOL_COUNT));
		//getMostPopularCharCount
				assertEquals(MOST_POPULAR_COUNT_SPACE, st.getMostPopularCharCount());
//				assertEquals(MOST_POPULAR_COUNT, st.getMostPopularCharCount());
				
				assertEquals(MOST_POPULAR_CHAR_SPACE, st.getCharByCount( st.getMostPopularCharCount()));
		//getChars
				assertEquals((Integer)st.getCharCount(SYMBOL), st.getChars().get(SYMBOL_STRING));
				assertEquals(SYMBOL, st.getCharByCount(st.getChars().get(SYMBOL_STRING)));
	}
	
	@Test
	public void pshen(){
		com.sourceit.java.basic.pshen.ht11.TextStatistics st = new com.sourceit.java.basic.pshen.ht11.Text(TEXT);

		//words
//				assertEquals(words, st.words().size());
		//getCharCount
				assertEquals(SYMBOL_COUNT, st.getCharCount(SYMBOL));
		//getCharByCount
				assertEquals(SYMBOL, st.getCharByCount(SYMBOL_COUNT));
		//getMostPopularCharCount
				assertEquals(MOST_POPULAR_COUNT_SPACE, st.getMostPopularCharCount());
//				assertEquals(MOST_POPULAR_COUNT, st.getMostPopularCharCount());
				
				assertEquals(MOST_POPULAR_CHAR_SPACE, st.getCharByCount( st.getMostPopularCharCount()));
		//getChars
				assertEquals((Integer)st.getCharCount(SYMBOL), st.getChars().get(SYMBOL_STRING));
				assertEquals(SYMBOL, st.getCharByCount(st.getChars().get(SYMBOL_STRING)));

//		getLeastPopularCharCount
		
	}
	
	@Test
	public void sungurov(){
		com.sourceit.javabasic.sungurov.HT11.TextStatistics st = new com.sourceit.javabasic.sungurov.HT11.TextOp(TEXT);

		//words
//				assertEquals(words, st.words().size());
		//getCharCount
				assertEquals(SYMBOL_COUNT, st.getCharCount(SYMBOL));
		//getCharByCount
//				assertEquals(SYMBOL, st.getCharByCount(SYMBOL_COUNT));
		//getMostPopularCharCount
//				assertEquals(MOST_POPULAR_COUNT_SPACE, st.getMostPopularCharCount());
				assertEquals(MOST_POPULAR_COUNT, st.getMostPopularCharCount());
				
//				assertEquals(MOST_POPULAR_CHAR_SPACE, st.getCharByCount( st.getMostPopularCharCount()));
		//getChars
//				assertEquals((Integer)st.getCharCount(SYMBOL), st.getChars().get(SYMBOL_STRING));
//				assertEquals(SYMBOL, st.getCharByCount(st.getChars().get(SYMBOL_STRING)));

//		getLeastPopularCharCount
		
	}
	/**
	 * Created by http://www.xwray.com/fiftyshades 
	 */
	public static final String TEXT = "'Here? ,' he breathes, his voice husky, and everything in my body tightens as dark desire unfolds throughout my body. I glance nervously at the bed.\n" +
            "\n" +
            "Leaning down, he softly kisses my cheek, exploring, anticipation and anxiety charging through me. His eyes glowing with lust, dominating, he plants a soft kiss on my lips. His fingers curl into my hair, pulling my head back. My subconscious is doing the merengue with some salsa moves.\n" +
            "\n" +
            "He straightens. God, he's so fucked-up. His leather strap is propped against the stack of books on his desk. I don't know if I can do this for him.\n" +
            "\n" +
            "Without warning, he yanks me off my feet, shoving me against the wall. My heart is pounding, pleasure lancing directly to my groin, pleasure lancing directly to my groin. He softly runs his fingers up my back so that desire seizes me with a vengeance. Why am I embarrassed by this? Shit.";

	private static final int words = 155;
	private static final char SYMBOL = 'r';
	private static final String SYMBOL_STRING = String.valueOf(SYMBOL);
	private static final int SYMBOL_COUNT = 32;  
	
	private static final int MOST_POPULAR_COUNT_SPACE = 151;
	private static final char MOST_POPULAR_CHAR_SPACE = ' ';
	
	private static final int MOST_POPULAR_COUNT = 68;
	private static final char MOST_POPULAR_CHAR = 'e';
	int characterCount = 681;
}
