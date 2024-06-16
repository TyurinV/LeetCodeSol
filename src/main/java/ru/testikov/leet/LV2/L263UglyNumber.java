package ru.testikov.leet.LV2;

public class L263UglyNumber {
    public static boolean isUgly(int n) {
        for (int i = 2; i < 6; i++) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }
}
