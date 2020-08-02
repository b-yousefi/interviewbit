package interviewbit.linkedLists;

class SwapListNodes {
    public ListNode swapPairs(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode head = listNode.next;
        ListNode pre = null;
        ListNode current = listNode;
        while (current != null && current.next != null) {
            ListNode next = current.next;
            ListNode nextNext = next.next;
            if (pre != null) {
                pre.next = next;
            }
            next.next = current;
            current.next = nextNext;
            pre = current;
            current = nextNext;
        }
        return head;
    }
}