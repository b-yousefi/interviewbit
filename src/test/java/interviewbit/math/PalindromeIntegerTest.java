package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeIntegerTest {

    @Test
    public void isPalindrome() {
        PalindromeInteger palindromeInteger = new PalindromeInteger();
        assertTrue(palindromeInteger.isPalindrome(123321));
    }
}