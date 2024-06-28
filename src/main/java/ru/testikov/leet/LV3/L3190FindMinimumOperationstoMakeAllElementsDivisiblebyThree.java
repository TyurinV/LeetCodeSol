package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L3190FindMinimumOperationstoMakeAllElementsDivisiblebyThree {
    public static int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).filter(value -> value % 3 != 0).count();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(minimumOperations(a));
    }
}
