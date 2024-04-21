package ru.testikov.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class L2032TwoOutofThree {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> one = new HashSet<>();
        Set<Integer> two = new HashSet<>();
        for (int i : nums1) {
            one.add(i);
        }
        for (int i : nums2) {
            if (one.contains(i)) result.add(i);
            two.add(i);
        }

        for (int i : nums3) {
            if (one.contains(i) || two.contains(i)) {
                result.add(i);
            }
        }

        return result.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {4, 3, 3};
        int[] nums3 = {5,3,1};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
}
