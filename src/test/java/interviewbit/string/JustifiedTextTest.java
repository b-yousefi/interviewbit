package interviewbit.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JustifiedTextTest {

    @Test
    public void fullJustify() {
        JustifiedText js = new JustifiedText();
        ArrayList<String> strs = new ArrayList<>();
        strs.add("This");
        strs.add("is");
        strs.add("an");
        strs.add("example");
        strs.add("of");
        strs.add("text");
        strs.add("justification.");

        assertEquals(List.of("This    is    an", "example  of text", "justification.  "), js.fullJustify(strs, 16));
    }
}