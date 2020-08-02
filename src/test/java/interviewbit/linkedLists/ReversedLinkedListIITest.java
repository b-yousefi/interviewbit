package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversedLinkedListIITest {

    @Test
    public void reverseBetween() {
        ReversedLinkedListII reversedLinkedList = new ReversedLinkedListII();

        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        assertEquals("1 -> 4 -> 3 -> 2 -> 5", reversedLinkedList.reverseBetween(a, 2, 4).toString());
    }
}