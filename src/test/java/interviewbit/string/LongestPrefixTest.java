package interviewbit.string;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LongestPrefixTest {

    @Test
    public void longestCommonPrefix() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abab");
        list1.add("ab");
        list1.add("abcd");

        LongestPrefix longestPrefix = new LongestPrefix();
        assertEquals("ab", longestPrefix.longestCommonPrefix(list1));
    }
}