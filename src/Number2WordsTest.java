import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Number2WordsTest {
	Number2Words.NumberWords numberWords = new Number2Words().new NumberWords();
	
	@Test
	public final void testNumber2Words() {
		assertEquals("1 is ONE", "ONE", numberWords.toWords(1));
		assertEquals("2 is TWO", "TWO", numberWords.toWords(2));
	}
	
	@Test
	public void userInputIsNegativeValue() {
		assertEquals("-1 should return the value Number out of range", "Number out of range", numberWords.toWords(-1));
		assertEquals("-999 should return the value Number out of range", "Number out of range", numberWords.toWords(-999));
	}
	
	@Test
	public void userInputIsExactlyZero() {
		assertEquals("0 should return Zero", "ZERO", numberWords.toWords(0));
	}
	
	@Test
	public void userInputGreaterThan999() {
		assertEquals("Input value greater than 999 return Number out of range", "Number not in range", numberWords.toWords(1000));
	}
}
