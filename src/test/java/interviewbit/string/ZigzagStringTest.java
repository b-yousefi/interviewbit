package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigzagStringTest {

    @Test
    public void convert() {
        ZigzagString zigzagString = new ZigzagString();
        assertEquals("PAHNAPLSIIGYIR", zigzagString.convert(
                "PAYPALISHIRING", 3));
    }
}