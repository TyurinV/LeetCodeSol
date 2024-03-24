package ru.testikov.leet;

import java.util.Arrays;
import java.util.HashSet;

//287. Find the Duplicate Number
public class L287FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {22, 3, 4, 2, 22};
        int[] arr2 = {3, 1, 3, 4, 2};
        int[] arr3 = {3, 3, 3, 3, 3};
        int[] arr4 = {1, 1};
        System.out.println(findDuplicate4(arr));
        System.out.println(findDuplicate4(arr2));
        System.out.println(findDuplicate4(arr3));
        System.out.println(findDuplicate4(arr4));
    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] == nums[i + 1]) return nums[i];
        }
        return 0;
    }

    public static int findDuplicate2(int[] nums) {
        if (nums[0] == nums[1]) return nums[1];

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (hs.contains(nums[i])) return nums[i];
            hs.add(nums[i]);
        }
        return 0;
    }

    //неверное, для 10 не работает, а решение на сайте приняло!!!
    public static int findDuplicate3(int[] nums) {
        int[] tmp = new int[nums.length];

        for (int a : nums) {
            tmp[a]++;
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] >= 2) return i;
        }

        return 0;
    }
    //неверное, для 10 не работает, а решение на сайте приняло!!!
    public static int findDuplicate4(int[] nums) {
        boolean[] temp = new boolean[nums.length];
        for (int mun : nums) {
            if (temp[mun]) return mun;
            temp[mun] = true;
        }
        return 0;
    }

}
