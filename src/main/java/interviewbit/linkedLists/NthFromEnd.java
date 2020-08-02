package interviewbit.linkedLists;

class NthFromEnd {
    public ListNode removeNthFromEnd(ListNode A, int l) {
        ListNode result = A;
        ListNode r = A;
        int length = 0;
        while (r != null) {
            if (length > l) {
                if (result.next.next != null) {
                    result = result.next;
                }
            }
            r = r.next;
            length++;
        }
        if (length <= l) {
            A = A.next;
        } else {
            result.next = result.next.next;
        }
        return A;
    }
}