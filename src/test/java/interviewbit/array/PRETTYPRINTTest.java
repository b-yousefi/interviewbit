package interviewbit.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PRETTYPRINTTest {

    @Test
    public void prettyPrint() {
        PRETTYPRINT prettyprint = new PRETTYPRINT();
        assertEquals(List.of(List.of(2, 2, 2), List.of(2, 1, 2), List.of(2, 2, 2)), prettyprint.prettyPrint(2));
    }
}
