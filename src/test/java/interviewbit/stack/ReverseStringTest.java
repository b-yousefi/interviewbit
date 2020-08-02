package interviewbit.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        ReverseString reverseString = new ReverseString();
        assertEquals("hjkbhb", reverseString.reverseString("bhbkjh"));
    }
}