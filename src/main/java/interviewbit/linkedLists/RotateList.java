package interviewbit.linkedLists;

class RotateList {
    private int lengthList(ListNode a) {
        int lenght = 0;
        ListNode list = a;
        while (list != null) {
            lenght++;
            list = list.next;
        }
        return lenght;
    }

    public ListNode rotateRight(ListNode a, int b) {
        int size = lengthList(a);
        if (b > size) {
            b = b % size;
        }
        if (b == size || b == 0) {
            return a;
        }
        int k = size - b - 1;
        ListNode kList;
        ListNode head = a, result;
        int length = 0;
        while (a != null && length < k) {
            a = a.next;
            length++;
        }
        result = a;
        while (a.next != null) {
            a = a.next;
        }
        kList = result;
        result = result.next;
        kList.next = null;
        a.next = head;

        return result;
    }

}