package ru.testikov.leet;

import java.util.Arrays;

public class L27RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }

    public static void main(String[] args) {
        int[] n = {3, 2, 2, 3};
        System.out.println(removeElement(n, 2));
    }
}
