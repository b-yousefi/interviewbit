package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode a = new ListNode(5);
        ListNode a1 = new ListNode(8);
        ListNode a2 = new ListNode(20);
        a.next = a1;
        a1.next = a2;
        ListNode b = new ListNode(4);
        ListNode b1 = new ListNode(11);
        ListNode b2 = new ListNode(15);
        b.next = b1;
        b1.next = b2;
        assertEquals("4 -> 5 -> 8 -> 11 -> 15 -> 20", mergeTwoSortedLists.mergeTwoLists(a, b).toString());
    }
}