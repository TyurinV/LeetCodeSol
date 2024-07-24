package ru.testikov.leet.LV3;

public class L461HammingDistance {
    public static int hammingDistance(int x, int y) {

        return Integer.bitCount(x^y);
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
        System.out.println(hammingDistance(1,4));
    }
}
