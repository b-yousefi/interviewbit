package interviewbit.bitManipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {

    @Test
    public void reverse() {
        ReverseBits reverseBits = new ReverseBits();
        assertEquals(3221225472L, reverseBits.reverse(3));
    }
}