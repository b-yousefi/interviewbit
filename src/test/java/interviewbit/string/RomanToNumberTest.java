package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToNumberTest {

    @Test
    public void romanToInt() {
        RomanToNumber romanToNumber = new RomanToNumber();
        assertEquals(14, romanToNumber.romanToInt("XIV"));
    }
}