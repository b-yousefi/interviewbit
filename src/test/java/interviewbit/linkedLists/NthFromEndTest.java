package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthFromEndTest {

    @Test
    public void removeNthFromEnd() {
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        NthFromEnd nthFromEnd = new NthFromEnd();
        assertEquals("1 -> 2 -> 3 -> 5", nthFromEnd.removeNthFromEnd(a, 2).toString());
    }
}