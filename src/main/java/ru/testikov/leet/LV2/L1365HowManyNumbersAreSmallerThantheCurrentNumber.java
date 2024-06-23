package ru.testikov.leet.LV2;

import java.util.*;

public class L1365HowManyNumbersAreSmallerThantheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // чило, сколько меньше
        Map<Integer, Integer> hm = new HashMap<>();
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        int count = 1;
        hm.put(tmp[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (tmp[i] == tmp[i - 1]) {
                count++;
            } else {
                hm.put(tmp[i], count);
                count++;
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = hm.get(nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 8};
        int[] nums3 = {7, 7, 7, 7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }
}
