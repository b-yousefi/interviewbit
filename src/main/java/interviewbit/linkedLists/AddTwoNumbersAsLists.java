package interviewbit.linkedLists;

class AddTwoNumbersAsLists {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {

        ListNode result = null, head = null;
        boolean carry = false;

        while (list1 != null && list2 != null) {
            int sum = carry ? 1 : 0;

            sum += list1.val + list2.val;
            int b = sum % 10;
            carry = sum / 10 > 0;
            ListNode s = new ListNode(b);
            if (result == null) {
                result = s;
                head = s;
            } else {
                result.next = s;
                result = s;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        while (list1 != null) {
            int sum = carry ? 1 : 0;
            sum += list1.val;
            int b = sum % 10;
            carry = sum / 10 > 0;
            ListNode s = new ListNode(b);
            if (result == null) {
                result = s;
                head = s;
            } else {
                result.next = s;
                result = s;
            }
            list1 = list1.next;
        }
        while (list2 != null) {
            int sum = carry ? 1 : 0;
            sum += list2.val;
            int b = sum % 10;
            carry = sum / 10 > 0;
            ListNode s = new ListNode(b);
            if (result == null) {
                result = s;
                head = s;
            } else {
                result.next = s;
                result = s;
            }
            list2 = list2.next;
        }
        if (carry) {
            result.next = new ListNode(1);
        }
        return head;
    }
}