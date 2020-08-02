package interviewbit.linkedLists;

class SortList {
    public ListNode sortList(ListNode a) {
        HeadTail headTail = sortI(a);
        if (headTail.head != null) {
            return headTail.head;
        } else {
            return headTail.tail;
        }
    }

    private HeadTail sortI(ListNode a) {
        if (a != null && a.next != null) {
            ListNode temp = a;
            a = a.next;
            temp.next = null;
            Partition pi = partition(a, temp.val);

            HeadTail s = sortI(pi.smaller.head);
            HeadTail b = sortI(pi.bigger.head);

            if (s.head != null) {
                s.tail.next = temp;
                temp.next = b.head;
                if (b.head == null) {
                    return new HeadTail(s.head, temp);
                } else {
                    return new HeadTail(s.head, b.tail);
                }
            } else {
                temp.next = b.head;
                return new HeadTail(temp, b.tail);
            }
        }
        return new HeadTail(a, a);
    }

    public Partition partition(ListNode a, int b) {
        ListNode head = null, tail = null;
        ListNode result = null, resultTail = null;
        if (a.val > b) {
            resultTail = tail = a;
        } else {
            result = head = a;
        }
        if (a.next == null) {
            if (head != null) {
                return new Partition(new HeadTail(head, head), new HeadTail(null, null));
            } else {
                return new Partition(new HeadTail(null, null), new HeadTail(tail, tail));
            }
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

        if (resultTail != null) {
            resultTail.next = null;
        }
        if (result != null) {
            result.next = null;
        }
        return new Partition(new HeadTail(head, result), new HeadTail(tail, resultTail));
    }

    static class HeadTail {
        ListNode head;
        ListNode tail;

        public HeadTail(ListNode head, ListNode tail) {
            this.head = head;
            this.tail = tail;
        }

    }

    static class Partition {
        HeadTail smaller;
        HeadTail bigger;

        public Partition(HeadTail smaller, HeadTail bigger) {
            this.smaller = smaller;
            this.bigger = bigger;
        }

    }
}