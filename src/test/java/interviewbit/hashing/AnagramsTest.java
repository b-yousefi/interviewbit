package interviewbit.hashing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {

    @Test
    public void anagrams() {

        Anagrams anagrams = new Anagrams();
        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("god");
        words.add("tac");

        assertEquals(List.of(List.of(1, 4), List.of(2, 3)), anagrams.anagrams(words));
    }
}