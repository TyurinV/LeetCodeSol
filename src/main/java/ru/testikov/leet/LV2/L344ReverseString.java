package ru.testikov.leet.LV2;

import java.util.Arrays;
import java.util.Stack;

public class L344ReverseString {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o' };
        reverseString(a);
        System.out.println(Arrays.toString(a));
    }
}
