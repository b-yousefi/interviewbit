package interviewbit.bitManipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOneBitsTest {

    @Test
    public void numSetBits() {
        NumberOneBits numberOneBits = new NumberOneBits();
        assertEquals(3, numberOneBits.numSetBits(11L));
    }
}