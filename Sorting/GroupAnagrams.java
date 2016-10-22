package Sorting;

import java.util.*;

public class GroupAnagrams {

    public String sortChars(String s) {
        char[] string = s.toCharArray();
        Arrays.sort(string);
        return new String(string);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new LinkedList<>();

        if (strs == null || strs.length == 0) {
            return result;
        }
        Arrays.sort(strs, new AnagramSorter());

        String checker = strs[0];
        List<String> current = new LinkedList<>();
        current.add(checker);
        checker = sortChars(checker);

        for (int i = 1; i < strs.length; i++) {

            if (checker.equals(sortChars(strs[i]))) {

                // System.out.println(checker);

                current.add(strs[i]);
            } else {
                result.add(current);
                current = new LinkedList<>();
                checker = strs[i];
                current.add(checker);
                checker = sortChars(checker);

            }
        }
        result.add(current);
        return result;

    }
}

class AnagramSorter implements Comparator<String> {

    public String sortChars(String s) {
        char[] string = s.toCharArray();
        Arrays.sort(string);
        return new String(string);
    }

    @Override
    public int compare(String o1, String o2) {
        return sortChars(o1).compareTo(sortChars(o2));
    }
}