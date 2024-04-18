package ru.testikov.leet;

public class L70ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) return n;

        int prev = 1;
        int current = 2;

        for (int i = 3; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
    }
}
