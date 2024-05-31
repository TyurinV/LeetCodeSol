package ru.testikov.leet.LV2;

public class L389FindtheDifference {
    public static char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;
        for (char a : s.toCharArray()) {
            sSum += a;
        }
        for (char a : t.toCharArray()) {
            tSum += a;
        }
        if (s.length() > t.length()) {
            return (char) (sSum - tSum);
        } else return (char) (tSum - sSum);
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
