package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L2733NeitherMinimumnorMaximum {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[0] && nums[i] != nums[nums.length - 1]) return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
