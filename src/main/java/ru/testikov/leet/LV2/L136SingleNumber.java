package ru.testikov.leet.LV2;

public class L136SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int a : nums) {
            result ^= a;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 1};
        int[] b = {4, 1, 2, 1, 2};
        int[] c = {1};
        System.out.println(singleNumber(a));
        System.out.println(singleNumber(b));
        System.out.println(singleNumber(c));
    }
}
