package ru.testikov.leet.LV3;

import java.util.*;

public class L350IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm1 = new HashMap<>(nums1.length);
        List<Integer> arr = new ArrayList<>();

        for (int a : nums1) {
            hm1.put(a, hm1.containsKey(a) ? hm1.get(a) + 1 : 1);
        }

        for (int b : nums2) {
            if (hm1.containsKey(b)) {
                if (hm1.get(b) > 0) {
                    hm1.put(b, hm1.get(b) - 1);
                    arr.add(b);
                }
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        int[] nums11 = {1, 2, 2, 1};
        int[] nums22 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums11, nums22)));

        int[] nums111 = {8, 0, 3};
        int[] nums222 = {0, 0};
        System.out.println(Arrays.toString(intersect(nums111, nums222)));
    }
}
