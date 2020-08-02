package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionSortListTest {

    @Test
    public void insertionSortList() {
        InsertionSortList insertionSortList = new InsertionSortList();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        a.next = a1;
        a1.next = a2;
        assertEquals("1 -> 2 -> 3", insertionSortList.insertionSortList(a).toString());
    }
}