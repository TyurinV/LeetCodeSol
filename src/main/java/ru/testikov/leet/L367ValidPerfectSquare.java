package ru.testikov.leet;

public class L367ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        for (int i = 2; i <= num && num< 100000 / 2; i++) {
            if (i * i == num) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(10));
        System.out.println(isPerfectSquare(Integer.MAX_VALUE));

    }
}
