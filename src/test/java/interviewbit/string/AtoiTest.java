package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtoiTest {

    @Test
    public void atoi() {
        Atoi atoi = new Atoi();
        assertEquals(9, atoi.atoi("9 2704"));
    }
}