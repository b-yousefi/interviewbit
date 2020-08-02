package interviewbit.linkedLists;

class InsertionSortList {
    public ListNode insertionSortList(ListNode a) {
        ListNode head = a, temp;
        a = a.next;
        head.next = null;
        while (a != null) {
            temp = head;
            if (a.val < temp.val) {
                head = a;
                a = a.next;
                head.next = temp;
            } else {
                while (temp.next != null && temp.next.val < a.val) {
                    temp = temp.next;
                }
                ListNode temp2 = temp.next;
                temp.next = a;
                a = a.next;
                temp.next.next = temp2;

            }
        }
        return head;
    }
}