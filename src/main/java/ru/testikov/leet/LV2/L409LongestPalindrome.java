package ru.testikov.leet.LV2;

import java.util.Arrays;

public class L409LongestPalindrome {
    public static int longestPalindrome(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (str[i] == str[i - 1]) {
                count += 2;
                i = i + 1;
            }
        }
        return s.length() == count ? count : count + 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("abb"));

    }
}
