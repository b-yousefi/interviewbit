package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapListNodesTest {

    @Test
    public void swapPairs() {
        SwapListNodes swapListNodes = new SwapListNodes();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        assertEquals("2 -> 1 -> 4 -> 3", swapListNodes.swapPairs(a).toString());
    }
}