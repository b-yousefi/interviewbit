package interviewbit.hashing;

import java.util.*;

public class Anagrams {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> words) {

        Map<Word, ArrayList<Integer>> wordToindx = new LinkedHashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String str = words.get(i);
            Word word = new Word(str);
            if (wordToindx.containsKey(word)) {
                wordToindx.get(word).add(i + 1);
            } else {
                ArrayList<Integer> indxs = new ArrayList<>();
                indxs.add(i + 1);
                wordToindx.put(word, indxs);
            }
        }
        return new ArrayList<>(wordToindx.values());
    }

    static class Word {
        String str;
        int hash;

        Word(String str) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            this.str = String.valueOf(chars);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Word word = (Word) o;
            return hash == word.hash &&
                    str.equals(word.str);
        }

        @Override
        public int hashCode() {
            return Objects.hash(str, hash);
        }
    }
}
