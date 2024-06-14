package ru.testikov.leet.LV2;

import java.util.*;

public class L945MinimumIncrementtoMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int cur = nums[i];
            if (prev >= cur) {
                counter += prev - cur + 1;
                nums[i] = prev + 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 2};
        int[] nums2 = {3, 2, 1, 2, 1, 7};
        L945MinimumIncrementtoMakeArrayUnique l945 = new L945MinimumIncrementtoMakeArrayUnique();
//        System.out.println(l945.minIncrementForUnique(nums));
        System.out.println(l945.minIncrementForUnique(nums2));

    }
}
