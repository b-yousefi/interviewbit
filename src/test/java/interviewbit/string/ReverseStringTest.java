package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void solve() {
        ReverseString reverseString = new ReverseString();
        assertEquals("blue is sky the", reverseString.solve("the sky is blue"));
    }
}