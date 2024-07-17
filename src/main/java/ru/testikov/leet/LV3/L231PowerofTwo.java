package ru.testikov.leet.LV3;

public class L231PowerofTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    /// n = 2 это 10 а n -1 это 01 в & это 00

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(8));
    }
}
