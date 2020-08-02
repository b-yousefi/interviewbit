package interviewbit.linkedLists;

class PalindromeList {

    int length = 0;

    public int lPalin(ListNode A) {
        ListNode reversed = reverseList(A);
        int mid = length / 2;
        int i = 0;
        while (i < mid) {
            if (A.val != reversed.val) {
                return 0;
            }
            A = A.next;
            reversed = reversed.next;
            i++;
        }
        return 1;
    }

    private ListNode clone(ListNode A) {
        if (A == null) {
            return null;
        }
        ListNode listNode = new ListNode(A.val);
        listNode.next = A.next;
        return listNode;
    }

    public ListNode reverseList(ListNode A) {
        ListNode next;
        ListNode result = clone(A);
        ListNode prev = null;
        length = 0;
        while (result != null) {
            next = result.next;
            result.next = prev;
            prev = clone(result);
            result = clone(next);
            length++;
        }
        return prev;
    }
}