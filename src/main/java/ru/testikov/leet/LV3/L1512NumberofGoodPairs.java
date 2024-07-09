package ru.testikov.leet.LV3;

import java.util.HashMap;
import java.util.Map;

public class L1512NumberofGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int a : nums) {
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> b : hm.entrySet()) {
            int v = b.getValue();
            if (v > 1) {
                res += (v * (v - 1)) / 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 3};
        int nums2[] = {1, 1, 1, 1};
        int nums3[] = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs(nums2));
        System.out.println(numIdenticalPairs(nums3));
    }
}
