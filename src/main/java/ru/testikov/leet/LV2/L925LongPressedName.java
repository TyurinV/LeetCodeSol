package ru.testikov.leet.LV2;

import java.util.HashMap;

public class L925LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int m = name.length(), n = typed.length();
        int i = 0, j = 0;

        while (i < m && j < n) {
            char c1 = name.charAt(i), c2 = typed.charAt(j);
            if (c1 != c2) return false; // we are handling different chars, no!

            int count1 = 0;
            while (i < m && name.charAt(i) == c1) {
                count1++;
                i++;
            }

            int count2 = 0;
            while (j < n && typed.charAt(j) == c2) {
                count2++;
                j++;
            }

            if (count2 < count1) return false;
        }
        return i == m && j == n;
    }

    public static void main(String[] args) {
        String name = "alex", typed = "aaleex";
        System.out.println(isLongPressedName(name, typed)); // true
        String name2 = "saeed", typed2 = "ssaaedd";
        System.out.println(isLongPressedName(name2, typed2)); // false
        String name3 = "xnhtq", typed3 = "xhhttqq";
        System.out.println(isLongPressedName(name3, typed3)); // false
    }
}
