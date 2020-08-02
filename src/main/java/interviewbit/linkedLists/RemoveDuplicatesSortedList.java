package interviewbit.linkedLists;

class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode pre = A;
        ListNode r = A.next;
        while (r != null) {
            if (pre.val == r.val) {
                pre.next = r.next;
            } else {
                pre = r;
            }
            r = r.next;
        }
        return A;
    }
}