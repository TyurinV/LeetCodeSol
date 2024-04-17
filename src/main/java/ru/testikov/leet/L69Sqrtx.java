package ru.testikov.leet;

public class L69Sqrtx {
    public static int mySqrt(int x) {
        if (x == 1) return 1;
        if (x == 0) return 0;
        int start = 0;
        int end = x / 2 + 1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if ((mid * mid) == x) {
                return (int) mid;
            }
            if ((mid * mid) > x) {
                end = (int) (mid - 1);
            } else {
                start = (int) (mid + 1);
            }
        }
        return end;
    }

    public static void main(String[] args) {
//        System.out.println(mySqrt(2));
//        System.out.println(mySqrt(5));
//        System.out.println(mySqrt(4));
//        System.out.println(mySqrt(8));
        System.out.println(mySqrt(2147483647));
    }
}
