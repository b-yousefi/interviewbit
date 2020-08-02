package interviewbit.linkedLists;

class ReversedLinkedListII {
    public ListNode reverseBetween(ListNode A, int m, int n) {
        ListNode next = null;
        ListNode current = A;
        ListNode prev = null;
        int indx = 1;
        while (current != null && indx < m) {
            prev = current;
            current = current.next;
            indx++;
        }
        ListNode tailR = current;
        ListNode tail = prev;
        prev = null;
        while (current != null && indx <= n) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            indx++;
        }
        tailR.next = next;
        if (tail == null) {
            return prev;
        }
        tail.next = prev;
        return A;
    }
}
