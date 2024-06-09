package ru.testikov.leet.LV2;

import java.util.HashMap;

public class L219ContainsDuplicateII {

    ///[1,2,3,1]


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // ключ равен nums[i], значение равно последней i
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                if (Math.abs(hm.get(nums[i]) - i) <= k) return true;
            }
            hm.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(nums1,3));
        int[] nums2 = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums2,1));
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums3,2));
    }
}
