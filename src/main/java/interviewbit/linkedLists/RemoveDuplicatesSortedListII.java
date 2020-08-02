package interviewbit.linkedLists;

class RemoveDuplicatesSortedListII {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode head;
        ListNode r;
        head = findHead(A);
        ListNode result = head;
        if (result == null) {
            return null;
        }
        r = result.next;
        head.next = null;
        while (r != null) {
            if (r.next == null) {
                result.next = r;
                break;
            }
            if (r.val == r.next.val) {
                while (r.next != null && r.val == r.next.val) {
                    r = r.next;
                }
                r = r.next;
            } else {
                result.next = r;
                result = result.next;
                r = result.next;
                result.next = null;
            }
        }
        return head;
    }

    private ListNode findHead(ListNode r) {
        while (r != null) {
            if (r.next == null) {
                return r;
            }
            if (r.val == r.next.val) {
                while (r.next != null && r.val == r.next.val) {
                    r = r.next;
                }
                r = r.next;
            } else {
                return r;
            }
        }
        return null;
    }
}