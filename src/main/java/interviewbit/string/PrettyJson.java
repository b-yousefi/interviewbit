package interviewbit.string;

import java.util.ArrayList;

class PrettyJson {
    public ArrayList<String> prettyJSON(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.trim().isEmpty()) {
            return result;
        }

        StringBuilder indention = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        boolean newLine = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[') {
                if (!newLine) {
                    result.add(stringBuilder.toString());
                }
                result.add(indention.toString() + str.charAt(i));
                stringBuilder = new StringBuilder();
                indention.append('\t');
                stringBuilder.append(indention.toString());
                newLine = true;
            } else if (str.charAt(i) == '}' || str.charAt(i) == ']') {
                indention.deleteCharAt(0);
                if (!newLine) {
                    result.add(stringBuilder.toString());
                    result.add(indention.toString() + str.charAt(i));
                    stringBuilder = new StringBuilder();
                } else {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    result.add(stringBuilder.toString() + str.charAt(i));
                    stringBuilder = new StringBuilder();
                }

                stringBuilder.append(indention.toString());
                newLine = true;
            } else if (str.charAt(i) == ',') {
                if (newLine) {
                    stringBuilder = new StringBuilder(result.get(result.size() - 1));
                    result.remove(result.size() - 1);
                }
                stringBuilder.append(",");
                result.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append(indention.toString());
                newLine = true;
            } else {
                stringBuilder.append(str.charAt(i));
                if (str.charAt(i) != ' ')
                    newLine = false;
            }
        }
        return result;
    }
}