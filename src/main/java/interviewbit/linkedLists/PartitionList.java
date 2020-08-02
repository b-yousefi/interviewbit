package interviewbit.linkedLists;

class PartitionList {
    public ListNode partition(ListNode a, int b) {
        ListNode head = null, tail = null;
        ListNode result = null, resultTail = null;
        if (a.val > b) {
            resultTail = tail = a;
        } else {
            result = head = a;
        }
        if (a.next == null) {
            return a;
        }
        a = a.next;
        while (a != null) {
            ListNode temp = a.next;
            if (a.val >= b) {
                if (resultTail != null) {
                    resultTail.next = a;
                    resultTail = a;
                } else {
                    resultTail = tail = a;
                }
            } else {
                if (result != null) {
                    result.next = a;
                    result = a;
                } else {
                    result = head = a;
                }
            }
            a = temp;
        }
        if (result == null) {
            return tail;
        } else {
            resultTail.next = null;
            result.next = tail;
            return head;
        }
    }

}