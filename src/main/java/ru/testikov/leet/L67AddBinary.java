package ru.testikov.leet;

import java.math.BigDecimal;
import java.math.BigInteger;

public class L67AddBinary {
    public static String addBinary(String a, String b) {
        BigDecimal sum1 = new BigDecimal("0");
        BigDecimal sum2 = new BigDecimal("0");
        BigDecimal base = new BigDecimal(2);
        BigDecimal temp;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') {
                int exponent = a.length() - 1 - i;
                temp = base.pow(exponent);
                sum1 = sum1.add(temp);
            }
        }
        System.out.println("Число " + sum1);
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                int exponent = b.length() - 1 - i;
                temp = base.pow(exponent);
                sum2 = sum2.add(temp);
            }
        }
        BigDecimal res = sum1.add(sum2);
        BigInteger bi = res.toBigInteger();

        return bi.toString(2);
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));

        String x = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001100";
        String y = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001100";
        System.out.println(addBinary(x, y));
    }
}
