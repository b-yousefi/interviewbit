package interviewbit.linkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeListTest {

    @Test
    public void lPalin() {
        PalindromeList palindromeList = new PalindromeList();
        ListNode a = new ListNode(6);
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(7);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(6);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        assertEquals(1, palindromeList.lPalin(a));
    }
}