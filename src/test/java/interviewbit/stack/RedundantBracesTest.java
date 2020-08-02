package interviewbit.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class RedundantBracesTest {

    @Test
    public void redundant_braces_true() {
        RedundantBraces redundantBraces = new RedundantBraces();
        assertEquals(1, redundantBraces.braces("((a + b))"));
    }

    @Test
    public void redundant_braces_false() {
        RedundantBraces redundantBraces = new RedundantBraces();
        assertEquals(0, redundantBraces.braces("(a + (a + b))"));
    }
}