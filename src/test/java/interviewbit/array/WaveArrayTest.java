package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WaveArrayTest {

    @Test
    public void wave() {
        WaveArray waveArray = new WaveArray();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(List.of(2, 1, 4, 3), waveArray.wave(list));
    }
}