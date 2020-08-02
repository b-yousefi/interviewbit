package interviewbit.string;

import java.util.ArrayList;
import java.util.Arrays;

class JustifiedText {
    public ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> result = new ArrayList<>();
        int wordInLine = 0;
        int lineLenght = 0;
        int i = 0;
        while (i < A.size()) {
            if (lineLenght + A.get(i).length() + wordInLine <= B) {
                lineLenght += A.get(i).length();
                i++;
                wordInLine++;
            } else {
                result.add(creatLine(A, B, lineLenght, wordInLine, i));
                wordInLine = 0;
                lineLenght = 0;
            }
        }
        if (wordInLine > 0) {
            result.add(creatLine(A, B, lineLenght, wordInLine, i));
        }
        return result;
    }

    private String creatLine(ArrayList<String> A, int B, int lineLenght, int wordInLine, int indx) {
        int space = B - lineLenght;
        String sp = "";
        int putSpace;
        int remain = 0;
        if (indx != A.size()) {
            if (wordInLine > 1) {
                putSpace = space / (wordInLine - 1);
            } else {
                putSpace = space;
            }
            if (putSpace > 0) {
                char[] spaces = new char[putSpace];
                Arrays.fill(spaces, ' ');
                sp = String.valueOf(spaces);
            }
            if (wordInLine > 1) {
                remain = space - putSpace * (wordInLine - 1);
            } else {
                remain = 0;
            }

        } else {
            if (wordInLine > 1)
                sp = " ";
        }

        StringBuilder lineBuilder = new StringBuilder();
        for (int j = indx - wordInLine; j < indx; j++) {
            lineBuilder.append(A.get(j));
            if (j != indx - 1 || wordInLine == 1) {
                lineBuilder.append(sp);
            }
            if (remain > 0) {
                lineBuilder.append(" ");
                remain--;
            }
        }
        if (indx == A.size()) {
            // last line
            if (space - wordInLine + 1 > 0) {
                char[] spaces = new char[space - wordInLine + 1];
                Arrays.fill(spaces, ' ');
                sp = String.valueOf(spaces);
                lineBuilder.append(sp);
            }
        }
        return lineBuilder.toString();
    }
}