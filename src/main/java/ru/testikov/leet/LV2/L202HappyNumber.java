package ru.testikov.leet.LV2;

import java.util.Arrays;

// 6 6 6
public class L202HappyNumber {
    public static boolean isHappy(int n) {
        int count = 0;
        while (count <= 15) {
            count++;
            if (n == 1) return true;
            n = summm(intToArray(n));
        }

        return false;
    }

    public static int[] intToArray(int x) {
        int[] tmp = new int[10];
        int count = 0;
        while (x > 0) {
            tmp[count] = x % 10;
            x = x / 10;
            count++;
        }
        return tmp;
    }

    public static int summm(int[] num) {
        int b = 0;
        for (int i = 0; i < num.length; i++) {
            b = b + num[i] * num[i];
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1999999999));
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
