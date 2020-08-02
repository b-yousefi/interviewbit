package interviewbit.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParenthesisTest {

    @Test
    public void isValid_false() {
        Parenthesis parenthesis = new Parenthesis();
        assertEquals(0, parenthesis.isValid("([)]"));
    }

    @Test
    public void isValid_true() {
        Parenthesis parenthesis = new Parenthesis();
        assertEquals(1, parenthesis.isValid("()[]{}"));
    }
}