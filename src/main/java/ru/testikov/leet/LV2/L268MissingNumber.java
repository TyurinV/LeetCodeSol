package ru.testikov.leet.LV2;

import java.util.Arrays;

public class L268MissingNumber {
    //с сортировкой
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 != nums[i]) return nums[i - 1] + 1;
        }
        return nums[nums.length - 1] + 1;
    }

    //через прогрессию
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int arifmeticSum = (n * (n + 1)) / 2;
        for (int a : nums) {
            sum += a;
        }
        return arifmeticSum - sum;
    }

    public static void main(String[] args) {
        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber2(a));
        int[] b = {0, 1};
        int[] c = {3, 0, 1};
        System.out.println(missingNumber2(b));
        System.out.println(missingNumber2(c));
    }
}
