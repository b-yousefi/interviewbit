package interviewbit.linkedLists;


class ReversedLinkedList {
    public ListNode reverseList(ListNode A) {
        ListNode next;
        ListNode result = A;
        ListNode prev = null;
        while (result != null) {
            next = result.next;
            result.next = prev;
            prev = result;
            result = next;
        }
        return prev;
    }
}

