package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateListTest {

    @Test
    public void rotateRight() {
        RotateList rotateList = new RotateList();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        assertEquals("4 -> 5 -> 1 -> 2 -> 3", rotateList.rotateRight(a, 2).toString());
    }
}