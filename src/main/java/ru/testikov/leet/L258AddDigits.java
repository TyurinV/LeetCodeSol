package ru.testikov.leet;


import java.util.Arrays;

public class L258AddDigits {
    public static int addDigits(int num) {

        String a = Integer.toString(num);
        if (a.length() == 1) return num;
        int b = 0;
        while (a.length() > 1) {
            b = 0;
            char[] x = a.toCharArray();
            for (char c : x) {
                b += c - '0';
            }
            a = Integer.toString(b);
        }
        return b;
    }

    public static int addDigits2(int num) {
        if (num < 10) return num;
        return num % 9 == 0 ? 9 :num % 9 ;
    }

    public static void main(String[] args) {


    }
}
