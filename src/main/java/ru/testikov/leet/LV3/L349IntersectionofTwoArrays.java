package ru.testikov.leet.LV3;

import java.util.*;

public class L349IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int a : nums1) {
            set.add(a);
        }
        for (int b : nums2) {
            if (set.contains(b)) {
                list.add(b);
            }
        }
        return Arrays.stream(list.toArray(new Integer[0])).mapToInt(Integer::intValue).distinct().toArray();
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        return Arrays.stream(nums2).filter(value -> {
            for (int a : nums1) {
                if (a == value) return true;
            }
            return false;
        }).distinct().toArray();
    }
}
