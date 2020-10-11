package io.generics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FindMaxGenericsTest  {
	
	@Test
	public void givenMultipleInt_shouldReturn_maxInteger() {
		Integer first = 9;
		Integer second = 5;
		Integer third = 7;
		Integer fourth = 10;
		Integer fifth = 1;
		Integer sixth = 2;
		assertEquals(fourth, new FindMaxGenerics<Integer>(first, second, third, fourth, fifth, sixth).testMaximum());
	}
	
	@Test
	public void givenMultipeFloat_shouldReturn_maxFloat() {
		Integer first = 9;
		Integer second = 51;
		Integer third = 7;
		Integer fourth = 10;
		assertEquals(second, new FindMaxGenerics<Integer>(first, second, third, fourth).testMaximum());
	}
	
	@Test
	public void givenMultipleFloat_shouldReturn_MaxFloat() {
		Float first = 9.5f;
		Float second = 5.4f;
		Float third = 7.1f;
		Float fourth = 10.5f;
		Float fifth = 12.7f;
		Float sixth = 20.7f;
		assertEquals(sixth, new FindMaxGenerics<Float>(first, second, third, fourth, fifth, sixth).testMaximum());
	}
	
	@Test
	public void givenMultipeInt_shouldReturn_maxInt() {
		Float first = 9.5f;
		Float second = 5.4f;
		Float third = 7.1f;
		Float fourth = 10f;
		assertEquals(fourth, new FindMaxGenerics<Float>(first, second, third, fourth).testMaximum());
	}
	

	@Test
	public void givenMultipeString_shouldReturn_maxString() {
		String first = "peach";
		String second = "banana";
		String third = "apple";
		String fourth = "coconut";
		assertEquals(first, new FindMaxGenerics<String>(first, second, third, fourth).testMaximum());
	}
	
	@Test
	public void givenMultipeString_shouldReturn_maxstring() {
		String first = "peach";
		String second = "banana";
		String third = "apple";
		String fourth = "coconut";
		String fifth = "mango";
		String sixth = "santra";
		assertEquals(sixth, new FindMaxGenerics<String>(first, second, third, fourth, fifth, sixth).testMaximum());
	}
}	

	


