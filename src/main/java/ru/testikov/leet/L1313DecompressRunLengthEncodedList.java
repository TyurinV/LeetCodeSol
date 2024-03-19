package ru.testikov.leet;

import java.util.Arrays;

public class L1313DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{2,3,4,5})));
    }

    static public int[] decompressRLElist(int[] nums) {
        int sumElements = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            sumElements += nums[i];
        }
        int[] result = new int[sumElements];

        int startIndeks = 0;
        for (int i = 1; i < nums.length; i += 2) {
            Arrays.fill(result, startIndeks, startIndeks + nums[i - 1], nums[i]);
            startIndeks += nums[i - 1];
        }
        return result;
    }
}
