package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTest {

    @Test
    public void getIntersectionNode() {
        Intersection intersection = new Intersection();
        ListNode a = new ListNode(5);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        a.next = a1;
        a1.next = a2;
        ListNode b = new ListNode(1);
        b.next = a1;
        assertEquals(a1, intersection.getIntersectionNode(b, a));
    }
}