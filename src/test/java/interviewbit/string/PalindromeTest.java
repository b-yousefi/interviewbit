package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertEquals(1, palindrome.isPalindrome("\"A man, a plan, a canal: Panama\""));
    }
}