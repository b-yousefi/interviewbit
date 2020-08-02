package interviewbit.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class ValidIpAddresses {
    ArrayList<String> result = new ArrayList<>();
    Queue<StringPoint> seen = new LinkedList<>();

    public ArrayList<String> restoreIpAddresses(String A) {
        seen.add(new StringPoint("." + A, 0));
        while (seen.size() != 0) {
            putPoint(seen.poll());
        }
        formatResult();
        return result;
    }

    private void formatResult() {
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i).substring(1));
        }
    }

    private void putPoint(StringPoint A) {
        int countPoint = A.point;
        int indx = A.str.lastIndexOf(".") + 1;
        if (countPoint == 3) {
            if(validNumber(A.str.substring(indx))){
                result.add(A.str);
            }
        } else {
            int i = 1;

            while (i <= 3 && indx + i < A.str.length()) {
                String str = A.str.substring(indx, indx + i);
                if (validNumber(str)) {
                    if (canBedivided(A.str.substring(indx + i), countPoint + 1)) {
                        seen.add(new StringPoint(A.str.substring(0, indx) + str + "." + A.str.substring(indx + i),
                                countPoint + 1));
                    }
                }
                i++;
            }
        }
    }

    private boolean validNumber(String str) {
        int intNum = Integer.parseInt(str);
        if ((str.startsWith("0") && intNum != 0) || (intNum == 0 && str.length() > 1)) {
            return false;
        } else {
            return intNum >= 0 && intNum < 256;
        }
    }

    private boolean canBedivided(String str, int i) {
        int f = str.length() / 3;
        return (f < 4 - i && (f != 0 || str.length() % 3 >= 4 - i)) || (f == 4 - i && str.length() % 3 == 0);
    }

    static class StringPoint {
        String str;
        int point;

        StringPoint(String str, int point) {
            this.str = str;
            this.point = point;
        }
    }

}