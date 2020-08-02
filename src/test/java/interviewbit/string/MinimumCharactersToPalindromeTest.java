package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCharactersToPalindromeTest {

    @Test
    public void solve() {
        MinimumCharactersToPalindrome min = new MinimumCharactersToPalindrome();
        assertEquals(2, min.solve("AACECAAAA"));
    }
}