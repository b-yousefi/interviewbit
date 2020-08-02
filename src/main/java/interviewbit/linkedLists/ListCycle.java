package interviewbit.linkedLists;

class ListCycle {
    public ListNode detectCycle(ListNode list) {
        ListNode temp = new ListNode(0);
        while (list != null) {
            if (list.next == temp) {
                return list;
            }
            ListNode temp2 = list.next;
            list.next = temp;
            list = temp2;
        }
        return null;
    }
}