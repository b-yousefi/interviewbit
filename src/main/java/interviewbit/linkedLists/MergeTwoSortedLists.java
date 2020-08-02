package interviewbit.linkedLists;

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode result;
        ListNode head;
        if (a.val < b.val) {
            head = a;
            a = a.next;
        } else {
            head = b;
            b = b.next;
        }
        result = head;
        while (a != null && b != null) {
            if (a.val < b.val) {
                result.next = a;
                a = a.next;
            } else {
                result.next = b;
                b = b.next;
            }
            result = result.next;
        }
        while (a != null) {
            result.next = a;
            result = result.next;
            a = a.next;
        }
        while (b != null) {
            result.next = b;
            result = result.next;
            b = b.next;
        }
        return head;
    }
}