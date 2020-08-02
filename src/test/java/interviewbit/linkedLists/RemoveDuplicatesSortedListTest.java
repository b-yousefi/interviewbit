package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesSortedListTest {

    @Test
    public void deleteDuplicates() {
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(3);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        RemoveDuplicatesSortedList removeDuplicatesSortedList = new RemoveDuplicatesSortedList();
        assertEquals("1 -> 2 -> 3", removeDuplicatesSortedList.deleteDuplicates(a).toString());
    }
}