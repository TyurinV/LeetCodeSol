package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L3194MinimumAverageofSmallestandLargestElements {
    public static double minimumAverage(int[] nums) {
        double res = Double.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            res = Double.compare(res, ((nums[i] + nums[nums.length - 1 - i]) / 2.0d)) < 0 ? res : ((nums[i] + nums[nums.length - 1 - i]) / 2.0d);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {7, 8, 3, 4, 15, 13, 4, 1};
        int[] b = {1, 9, 8, 3, 10, 5};
        int[] c = {1, 2, 3, 7, 8, 9};
        System.out.println(minimumAverage(a));
        System.out.println(minimumAverage(b));
        System.out.println(minimumAverage(c));
    }

}
