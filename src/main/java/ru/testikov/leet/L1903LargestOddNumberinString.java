package ru.testikov.leet;

public class L1903LargestOddNumberinString {
    public static String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (sb.charAt(i) % 2 == 0) {
                sb.deleteCharAt(i);
            } else return sb.toString();

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
        System.out.println(largestOddNumber("7542351161"));
        System.out.println(largestOddNumber("239537672423884969653287101"));
    }
}
