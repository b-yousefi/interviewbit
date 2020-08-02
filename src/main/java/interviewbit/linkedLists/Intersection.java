package interviewbit.linkedLists;

class Intersection {
    private int lengthList(ListNode a) {
        int lenght = 0;
        ListNode list = a;
        while (list != null) {
            lenght++;
            list = list.next;
        }
        return lenght;
    }

    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return null;
        }
        int lenghtA = lengthList(a);
        int lenghtB = lengthList(b);
        if (lenghtA > lenghtB) {
            int d = lenghtA - lenghtB;
            return getIntersection(a, b, d);
        } else {
            int d = lenghtB - lenghtA;
            return getIntersection(b, a, d);
        }
    }

    private ListNode getIntersection(ListNode a, ListNode b, int d) {
        ListNode aL = a, bL = b;
        for (int i = 0; i < d; i++) {
            aL = aL.next;
        }
        while (aL != null && bL != null) {
            if (aL == bL) {
                return aL;
            }
            aL = aL.next;
            bL = bL.next;
        }
        return null;
    }
}