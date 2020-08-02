package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesSortedListIITest {

    @Test
    public void deleteDuplicates() {
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(4);
        ListNode a6 = new ListNode(5);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        RemoveDuplicatesSortedListII removeDuplicatesSortedList = new RemoveDuplicatesSortedListII();
        assertEquals("1 -> 2 -> 5", removeDuplicatesSortedList.deleteDuplicates(a).toString());
    }
}