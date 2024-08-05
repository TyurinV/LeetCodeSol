package ru.testikov.leet.LV3;

import java.util.*;

public class L2053KthDistinctStringinanArray {
    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> hm = new HashMap<>();
        for (String a : arr) {
            hm.put(a, hm.containsKey(a) ? hm.get(a) + 1 : 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == 1 && k == 1) {
                return arr[i];
            } else if (hm.get(arr[i]) == 1 && k != 1) {
                k--;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        System.out.println(kthDistinct(arr, 3));
    }
}
