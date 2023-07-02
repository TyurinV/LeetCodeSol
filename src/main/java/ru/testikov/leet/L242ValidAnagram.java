package ru.testikov.leet;

import java.util.Arrays;

public class L242ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("arra", "arar"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] word = s.toCharArray();
        char[] word2 = t.toCharArray();

        Arrays.sort(word);
        Arrays.sort(word2);

        return Arrays.equals(word, word2);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(0) - 'a']++;
            counter[t.charAt(0) - 'a']--;
        }
        for (int a : counter) {
            if (a != 0) return false;
        }

        return true;
    }
}
