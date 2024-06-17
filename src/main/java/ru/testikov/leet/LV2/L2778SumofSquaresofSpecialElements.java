package ru.testikov.leet.LV2;

public class L2778SumofSquaresofSpecialElements {
    public static int sumOfSquares(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % (i+1) == 0) {
                res += nums[i] * nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}; //21
        int[] b = {2, 7, 1, 19, 18, 3}; //63
        System.out.println(sumOfSquares(a));
        System.out.println(sumOfSquares(b));

    }

}
