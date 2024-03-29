package ru.testikov.leet;

public class L1446ConsecutiveCharacters {
    public static int maxPower(String s) {
        int result = 0,
                tmp = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                tmp++;
            } else tmp = 1;
            if (tmp > result) {
                result = tmp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }
}
