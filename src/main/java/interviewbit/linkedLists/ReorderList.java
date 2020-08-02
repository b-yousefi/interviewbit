package interviewbit.linkedLists;

class ReorderList {
    int length = 0;

    public ListNode reverseList(ListNode A) {
        ListNode next;
        ListNode result = clone(A);
        ListNode prev = null;
        while (result != null) {
            next = clone(result.next);
            result.next = prev;
            prev = result;
            result = next;
            length++;
        }
        return prev;
    }

    private ListNode clone(ListNode A) {
        if (A == null) {
            return null;
        }
        ListNode listNode = new ListNode(A.val);
        listNode.next = A.next;
        return listNode;
    }

    public ListNode reorderList(ListNode A) {
        ListNode tail = reverseList(A);
        ListNode head = A;
        ListNode temp;
        ListNode temp2;
        int mid = length / 2;

        int indx = 0;
        while (indx < mid) {
            temp = head.next;
            head.next = tail;
            temp2 = tail.next;
            if (length % 2 == 0 && indx + 1 == mid) {
                break;
            }
            tail.next = temp;
            head = temp;
            tail = temp2;
            indx++;
        }
        if (length % 2 != 0) {
            head.next = null;
        } else {
            tail.next = null;
        }

        return A;
    }
}