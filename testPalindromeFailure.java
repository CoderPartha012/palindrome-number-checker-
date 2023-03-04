import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPalindromeFailure {
	@Test
	public void testPalindromeNumber (){
		int number1 = 2345;
		int number2 = 5678;
		int number3 = 9876;
		assertEquals(false, isPalindromeNumber(number1));
		assertEquals(false, isPalindromeNumber(number2));
		assertEquals(false, isPalindromeNumber(number3));
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