package ru.testikov.leet.LV2;

public class L2485FindthePivotInteger {
    public static int pivotInteger(int n) {
        if (n == 1) return 1;
        for (int i = 0; i < n; i++) {
            if (arifm(0, i) == arifm(i, n)) return i;
        }
        return -1;
    }

    public static int arifm(int first, int n) {
        int sum = first;
        if (n == first) {
            return first;
        } else {
            return sum + arifm(first + 1, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(pivotInteger(4));
    }
}
