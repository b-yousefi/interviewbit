package interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class MaxDistance {

    public int maximumGap(final List<Integer> A) {
        if (A.size() < 1) {
            return 0;
        }
        List<ItemIndex> list = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            list.add(new ItemIndex(A.get(i), i));
        }
        Collections.sort(list);
        Iterator<ItemIndex> it = list.iterator();
        ItemIndex startItem = it.next();
        int max = 0;
        while (it.hasNext()) {
            ItemIndex nextItem = it.next();
            if (nextItem.index > startItem.index) {
                int distance = nextItem.index - startItem.index;
                if (distance > max) {
                    max = distance;
                }
            } else {
                if (nextItem.item > startItem.item) {
                    startItem = nextItem;
                }
            }
        }
        return max;
    }

    static class ItemIndex implements Comparable<ItemIndex> {
        private Integer item;
        private Integer index;

        ItemIndex(int item, int index) {
            this.index = index;
            this.item = item;
        }

        @Override
        public int compareTo(ItemIndex o) {
            int result = item.compareTo(o.item);
            if (result == 0) {
                return index.compareTo(o.index);
            }
            return result;
        }

    }
}