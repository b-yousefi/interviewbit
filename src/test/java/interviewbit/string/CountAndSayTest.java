package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayTest {

    @Test
    public void countAndSay() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("11131221133112132113212221", countAndSay.countAndSay(11));
    }
}