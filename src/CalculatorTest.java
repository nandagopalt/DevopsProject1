	

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
	private Calculator c = new Calculator(); 

	@Test
	public void additionOfTwoPositiveValuesReturnPostiveValue() {
		assertEquals("10 + 15 Should be 25", 25, c.add(10, 15));
		assertEquals("20 + 5 Should be 25", 25, c.add(20, 5));
	}
	
	@Test
	public void additionOfTwoNegativeValuesReturnNegtiveValue() {
		assertEquals("-10 + -10 Should be -20", -20, c.add(-10, -10));
		assertEquals("-20 + -89 Should be -109", -109, c.add(-20 , -89));
	}
	
	@Test
	public void additionOfOneHighPositiveAndOneLowNegativeValuesReturnPostiveValue() {
        assertEquals("10 + -5 Should be 5", 5, c.add(10, -5));
	}
	
	@Test
	public void addtionOfOneHighNegtiveAndOneLowPostiveValuesReturnNegativeValue() {
		assertEquals("-15 + 5 Should be -10", -10, c.add(-15, 5));
	}
	
	 
	
	@Test	
	public void testSubtraction() {
		assertEquals("60 - 30 Should be 30", 30 , c.sub(60, 30));
	}
	
	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		assertEquals("10 x 0 Should be 0", 0, c.multiply(10, 0));
		assertEquals("0 x 10 Should be 0", 0, c.multiply(0, 10));
		assertEquals("0 x 0 Should be 0", 0, c.multiply(0, 0));
	}

}
