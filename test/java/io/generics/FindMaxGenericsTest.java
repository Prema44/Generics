package io.generics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMaxGenericsTest {
	
	public static FindMaxGenerics findMaxGenerics;
	
	@BeforeEach
	public void initiate() {
		findMaxGenerics = new FindMaxGenerics();
	}

	@Test
	public void givenFirstMax_shouldReturn_first() {
		Integer first = 9;
		Integer second = 5;
		Integer third = 7;
		assertEquals(first, findMaxGenerics.maxNumInt(first, second, third));
	}
	
	@Test
	public void second() {
		Integer first = 9;
		Integer second = 10;
		Integer third = 7;
		assertEquals(second, findMaxGenerics.maxNumInt(first, second, third));
	}
	
	@Test
	public void givenThirdMax_shouldReturn_third() {
		Integer first = 9;
		Integer second = 5;
		Integer third = 10;
		assertEquals(third, findMaxGenerics.maxNumInt(first, second, third));
	}
}	

	


