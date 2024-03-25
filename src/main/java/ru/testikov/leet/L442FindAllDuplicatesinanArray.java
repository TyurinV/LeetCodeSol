package ru.testikov.leet;

import java.util.*;

//442. Find All Duplicates in an Array
public class L442FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] arr = {22, 3, 4, 2, 22, 3};
        int[] arr2 = {3, 1, 3, 4, 2};
        int[] arr3 = {3, 3, 3, 3, 3};
        int[] arr4 = {1, 1};
        System.out.println(findDuplicate4(arr));
        System.out.println(findDuplicate4(arr2));
        System.out.println(findDuplicate4(arr3));
        System.out.println(findDuplicate4(arr4));
    }


    public static List<Integer> findDuplicate4(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int a : nums) {
            hm.put(a, hm.containsKey(a) ? hm.get(a) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
