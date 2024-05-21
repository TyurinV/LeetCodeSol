package ru.testikov.leet;

import java.util.Arrays;

public class L283MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < len; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        int[] b = {0, 1};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));

        moveZeroes(b);
        System.out.println(Arrays.toString(b));
    }
}
