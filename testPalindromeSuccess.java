import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPalindromeSuccess {
	@Test
	public void testPalindromeNumber (){
		int number1 = 1221;
		int number2 = 3443;
		int number3 = 4554;
		int number4 = 5665;
		int number5 = 6776;
		assertEquals(true, isPalindromeNumber(number1));
		assertEquals(true, isPalindromeNumber(number2));
		assertEquals(true, isPalindromeNumber(number3));
		assertEquals(true, isPalindromeNumber(number4));
		assertEquals(true, isPalindromeNumber(number5));
	}
	public boolean isPalindromeNumber (int number) {
		int reverse = 0;
        int original = number;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        return original == reverse;
	}
}
