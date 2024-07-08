package ru.testikov.leet.LV3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1800MaximumAscendingSubarraySum {
    public static int maxAscendingSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        int tmp = nums[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                list.add(tmp);
                tmp = nums[i];
            } else if (i == nums.length - 1) {
                tmp += nums[i];
                list.add(tmp);
            } else tmp += nums[i];
        }
        return list.stream().max(Integer::compareTo).get();
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 5, 10, 50};
        int[] nums2 = {6, 10, 6};
        System.out.println(maxAscendingSum2(nums));
        System.out.println(maxAscendingSum2(nums2));
    }
//best ans
    public static int maxAscendingSum2(int[] nums) {
        int ans = nums[0],
                sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = nums[i] > nums[i - 1] ? sum + nums[i] : nums[i];
            ans = ans > sum ? ans : sum;
        }
        return ans;
    }
}
