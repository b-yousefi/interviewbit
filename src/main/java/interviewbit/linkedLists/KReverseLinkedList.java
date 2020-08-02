package interviewbit.linkedLists;

class KReverseLinkedList {
    public ListNode reverseList(ListNode A, int k) {
        if (A == null) {
            return A;
        }
        ListNode next;
        ListNode result = A;
        ListNode prev = null;
        int indx = 0;
        while (indx < k && result != null) {
            next = result.next;
            result.next = prev;
            prev = result;
            result = next;
            indx++;
        }
        A.next = reverseList(result, k);

        return prev;
    }
}