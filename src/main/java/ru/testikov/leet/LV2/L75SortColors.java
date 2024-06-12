package ru.testikov.leet.LV2;

import java.util.Arrays;

public class L75SortColors {
    public static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero > 0) {
                nums[i] = 0;
                zero--;
            } else if (one > 0) {
                nums[i] = 1;
                one--;
            } else nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] a = {2,0,1};
        sortColors(a);
    }

}
