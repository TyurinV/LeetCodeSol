package ru.testikov.leet;

import java.util.HashMap;
import java.util.Map;

//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/
public class L217ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.containsKey(nums[i]) ? hm.get(nums[i]) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> tmp : hm.entrySet())
            if (tmp.getValue() > 1) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        int[] b = {1, 2, 3, 4};
        System.out.println(containsDuplicate(a));
        System.out.println(containsDuplicate(b));
    }
}
