package interviewbit.hashing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeat l = new LongestSubstringWithoutRepeat();
        assertEquals(3, l.lengthOfLongestSubstring("abcabcbb"));
    }
}