package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MaxProdTest {

    @Test
    public void maxSpecialProduct() {
        MaxProd maxProd = new MaxProd();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(4);

        assertEquals(3, maxProd.maxSpecialProduct(list1));
    }
}