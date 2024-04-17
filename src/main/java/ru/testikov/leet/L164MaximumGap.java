package ru.testikov.leet;

import java.util.Arrays;

public class L164MaximumGap {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > max) max = nums[i + 1] - nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] tst = {3, 6, 9, 1};
        System.out.println(maximumGap(tst));
    }
}
