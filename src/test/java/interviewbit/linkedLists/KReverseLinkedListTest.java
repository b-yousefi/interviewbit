package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KReverseLinkedListTest {

    @Test
    public void reverseList() {
        KReverseLinkedList rLinkedList = new KReverseLinkedList();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        ListNode a5 = new ListNode(6);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        assertEquals("2 -> 1 -> 4 -> 3 -> 6 -> 5", rLinkedList.reverseList(a, 2).toString());
    }
}