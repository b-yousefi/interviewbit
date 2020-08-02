package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastWordTest {

    @Test
    public void lengthOfLastWord() {
        LastWord lastWord = new LastWord();
        assertEquals(5, lastWord.lengthOfLastWord("Hello World"));
    }
}