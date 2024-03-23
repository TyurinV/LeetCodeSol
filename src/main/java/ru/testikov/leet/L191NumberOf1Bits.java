package ru.testikov.leet;
//191. Number of 1 Bits
public class L191NumberOf1Bits {
    public static int hammingWeight(int n) {
        if (n <0) return 0;
        String full = Integer.toBinaryString(n);
        String onlyZero = full.replace("1", "");
        return full.length() - onlyZero.length();
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(0));
    }
}
