package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryStringTest {

    @Test
    public void addBinary() {
        AddBinaryString addBinaryString = new AddBinaryString();
        assertEquals("111", addBinaryString.addBinary("100", "11"));
    }
}