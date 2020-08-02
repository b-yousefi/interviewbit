package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareVersionNumbersTest {

    @Test
    public void compareVersion() {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        assertEquals(-1, compareVersionNumbers.compareVersion("2", "4"));
    }
}