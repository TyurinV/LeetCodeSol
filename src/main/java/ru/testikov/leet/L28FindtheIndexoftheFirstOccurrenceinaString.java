package ru.testikov.leet;

public class L28FindtheIndexoftheFirstOccurrenceinaString {
    public static int strStr(String haystack, String needle) {
        int hay = haystack.length();
        int need = needle.length();
        for (int i = 0; i < hay; i++) {
            if(i+need > hay) break;
            if (needle.equals(haystack.substring(i, i + need))) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String one = "sadbutsad";
        String two = "sad";
        System.out.println(strStr(one,two));

    }
}
