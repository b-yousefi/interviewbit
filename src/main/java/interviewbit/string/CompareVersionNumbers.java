package interviewbit.string;

class CompareVersionNumbers {
    public int compareVersion(String A, String B) {
        String[] ANum = A.split("\\.");
        String[] BNum = B.split("\\.");
        int i = 0;
        while (i < ANum.length && i < BNum.length) {
            int compare = compareStringNum(ANum[i], BNum[i]);
            if (compare != 0) {
                return compare;
            } else {
                i++;
            }
        }
        if (i == ANum.length && i == BNum.length) {
            return 0;
        }
        if (i == ANum.length) {

            while (i < BNum.length) {
                String bString = getStringWithoutZero(BNum[i]);
                if (bString.isEmpty()) {
                    i++;
                } else {
                    return -1;
                }
            }
            return 0;
        } else {
            while (i < ANum.length) {
                String aString = getStringWithoutZero(ANum[i]);
                if (aString.isEmpty()) {
                    i++;
                } else {
                    return 1;
                }
            }
            return 0;
        }
    }

    int compareStringNum(String str1, String str2) {
        String str1Num = getStringWithoutZero(str1);
        String str2Num = getStringWithoutZero(str2);
        if (str1Num.length() == str2Num.length()) {
            int comp = str1Num.compareTo(str2Num);
            return Integer.compare(comp, 0);
        } else {
            if (str1Num.length() > str2Num.length()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    String getStringWithoutZero(String str) {
        int indxNonZero = 0;
        while (str.charAt(indxNonZero) == '0') {
            indxNonZero++;
            if (indxNonZero == str.length()) {
                return "";
            }
        }
        return str.substring(indxNonZero);
    }
}