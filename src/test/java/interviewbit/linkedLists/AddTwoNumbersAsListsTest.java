package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersAsListsTest {

    @Test
    public void addTwoNumbers() {
        ListNode a = new ListNode(2);
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(3);
        a.next = a1;
        a1.next = a2;

        ListNode b = new ListNode(5);
        ListNode b1 = new ListNode(6);
        ListNode b2 = new ListNode(4);
        b.next = b1;
        b1.next = b2;

        AddTwoNumbersAsLists addTwoNumbersAsLists = new AddTwoNumbersAsLists();
        assertEquals("7 -> 0 -> 8", addTwoNumbersAsLists.addTwoNumbers(a, b).toString());
    }
}