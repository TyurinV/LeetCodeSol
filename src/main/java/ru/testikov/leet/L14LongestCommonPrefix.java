package ru.testikov.leet;

import java.util.Arrays;

public class L14LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;

        while (index < first.length() && index < last.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else break;
        }
        return first.substring(0, index);
    }

    public static void main(String[] args) {
        String[] a = {"flower", "flow", "flight"};
        String[] b = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(a));
        System.out.println(longestCommonPrefix(b));
    }
}
