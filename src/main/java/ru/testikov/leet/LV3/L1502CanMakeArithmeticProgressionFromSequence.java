package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L1502CanMakeArithmeticProgressionFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int dif = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
           if (arr[i] - arr[i - 1] != dif) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1};
        int[] b = {3, 4, 1, 8, 9};
        int[] c = {3, 5, 1};
        System.out.println(canMakeArithmeticProgression(a));
        System.out.println(canMakeArithmeticProgression(b));
        System.out.println(canMakeArithmeticProgression(c));
    }
}
