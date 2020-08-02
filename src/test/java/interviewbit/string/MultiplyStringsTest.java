package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyStringsTest {

    @Test
    public void multiply() {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        assertEquals("120",multiplyStrings.multiply("12", "10"));
    }
}