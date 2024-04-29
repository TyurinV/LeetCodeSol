package ru.testikov.leet;

import java.util.HashSet;
import java.util.Set;

public class L2441LargestPositiveIntegerThatExistsWithItsNegative {
    public static int findMaxK(int[] nums) {
        Set<Integer> a = new HashSet<>();
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (a.contains(nums[i] * -1)) {
                if (Math.abs(nums[i]) >= max) {
                    max = Math.abs(nums[i]);
                }
            }
            a.add(nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-1, 2, -3, 3};
        int[] b = {-10, 8, 6, 7, -2, -3};
        System.out.println(findMaxK(a));
        System.out.println(findMaxK(b));
    }
}

