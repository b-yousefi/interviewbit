package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrStrTest {

    @Test
    public void strStr() {
        StrStr str = new StrStr();
        assertEquals(8, str.strStr("ababbbabbabaaababbbaabaaaba", "babaaa"));
    }
}