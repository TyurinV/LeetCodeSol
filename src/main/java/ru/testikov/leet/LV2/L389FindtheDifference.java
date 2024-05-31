package ru.testikov.leet.LV2;

import java.util.stream.Stream;

public class L389FindtheDifference {
    public static char findTheDifference(String s, String t) {

        int sSum = s.chars().sum();
        int tSum = t.chars().sum();

        if (s.length() > t.length()) {
            return (char) (sSum - tSum);
        } else return (char) (tSum - sSum);
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
