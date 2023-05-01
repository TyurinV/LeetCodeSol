package ru.testikov.leet;

import java.math.BigInteger;
import java.util.Arrays;

/*
66. Plus One
Easy
7.1K
4.9K
Companies
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */
public class L66PlusOne {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        while (digits[index] == 9) {
            digits[index] = 0;
            index--;
            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (index >= 0) {
            digits[index]++;
        }
        return digits;
    }

    public int[] plusOne2(int[] digits) {
        BigInteger result = null;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]); // записали в SB
        }
        String str = sb.toString(); // Преобразовали в стринг
        BigInteger bi = new BigInteger(str);
        result = bi.add(BigInteger.valueOf(1));

        String raw = result.toString(); // это момент работы со стрингой
        int[] num = new int[raw.length()];
        for (int i = 0; i < raw.length(); i++) {
            num[i] = raw.charAt(i) - '0';
        }
        return num;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {9, 9, 9, 9};
        int[] c = {8, 9, 9, 9};
        System.out.println(Arrays.toString(new L66PlusOne().plusOne(a)));
        System.out.println(Arrays.toString(new L66PlusOne().plusOne(b)));
        System.out.println(Arrays.toString(new L66PlusOne().plusOne(c)));

        System.out.println("____________________");

        int[] d = {1, 2, 3, 4};
        int[] e = {9, 9, 9, 9};
        int[] f = {8, 9, 9, 9};
        System.out.println(Arrays.toString(new L66PlusOne().plusOne2(d)));
        System.out.println(Arrays.toString(new L66PlusOne().plusOne2(e)));
        System.out.println(Arrays.toString(new L66PlusOne().plusOne2(f)));
    }
}
