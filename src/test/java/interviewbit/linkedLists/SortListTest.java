package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortListTest {

    @Test
    public void sortList() {
        SortList sortList = new SortList();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        assertEquals("1 -> 3 -> 4 -> 5", sortList.sortList(a).toString());
    }
}