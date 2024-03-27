package ru.testikov.leet;

public class L2119ANumberAfteraDoubleReversal {
    // 123 -> 3 2 1
    public static boolean isSameAfterReversals(int num) {
        if (num < 10) return true;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(num);
        int reverse1 = Integer.parseInt(sb1.reverse().toString());
        sb2.append(reverse1);
        int reverse2 = Integer.parseInt(sb2.reverse().toString());

        return num == reverse2;
    }

    public static boolean isSameAfterReversals2(int num) {
        int n = num, result = 0;
        while (n != 0) {
            int l = n % 10;
            result = (result * 10) + l;
            n = n / 10;
        }
        String s1 = Integer.toString(num);
        String s2 = Integer.toString(result);
        if (s1.length() == s2.length()) return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isSameAfterReversals2(526));
        System.out.println(isSameAfterReversals2(1800));
        System.out.println(isSameAfterReversals2(0));
    }
}
