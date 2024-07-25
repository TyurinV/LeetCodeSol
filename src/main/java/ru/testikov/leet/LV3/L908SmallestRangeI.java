package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L908SmallestRangeI {
    public static int smallestRangeI(int[] nums, int k) {
        return Math.max(Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt() -2 *k, 0);

    }

    public static void main(String[] args) {
        int[] a = {0,10};
        int[] b = {1};
        System.out.println(smallestRangeI(b, 0));
    }
}
