package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListCycleTest {

    @Test
    public void detectCycle() {
        ListCycle listCycle = new ListCycle();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a2;
        assertEquals(a2, listCycle.detectCycle(a));
    }
}