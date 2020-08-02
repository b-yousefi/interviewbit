package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void intToRoman() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        assertEquals("XIV", integerToRoman.intToRoman(14));
    }
}