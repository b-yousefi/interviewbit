package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedLinkedListTest {

    @Test
    public void reverseList() {
        ReversedLinkedList reversedLinkedList = new ReversedLinkedList();
        ListNode a = new ListNode(5);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        a.next = a1;
        a1.next = a2;
        assertEquals("3 -> 2 -> 5", reversedLinkedList.reverseList(a).toString());
    }
}