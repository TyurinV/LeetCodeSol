package ru.testikov.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//2404. Most Frequent Even Element
public class L2404MostFrequentEvenElement {
    public static int mostFrequentEven(int[] nums) {
        int[] tmp = new int[100001];
        for (int a : nums) tmp[a]++;
        int result = -1, freq = 0, min = 100000;
        for (int i = 0; i < tmp.length; i++) {
            if (i % 2 == 0 && freq < tmp[i]) {
                freq = tmp[i];
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{2, 10000, 10000, 10000, 2}));
    }
}
