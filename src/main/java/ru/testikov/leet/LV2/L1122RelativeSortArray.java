package ru.testikov.leet.LV2;

import java.util.*;
import java.util.stream.Collectors;


//arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6] <2,3>
//  [2,2,2,1,4,3,3,9,6,7,19]
public class L1122RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // ключ это arr1[i] значение - повтороение

        int[] result = new int[arr1.length];
        int index = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int a : arr1) {
            if (hm.containsKey(a)) {
                hm.put(a, hm.get(a) + 1);
            } else hm.put(a, 1);
        }

        List<Integer> a1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> a2 = Arrays.stream(arr2).boxed().toList();
        a1.removeAll(a2);
        a1.sort(Integer::compareTo);

        for (int i = 0; i < arr2.length; i++) {
            int key = arr2[i];
            int value = hm.get(key);
            for (int j = 0; j < value; j++) {
                result[index] = key;
                index++;
            }
        }
        for (int a : a1) {
            result[index] = a;
            index++;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = {2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31};
        int[] b = {2, 42, 38, 0, 43, 21};

        System.out.println(Arrays.toString(relativeSortArray(a, b)));
    }
}
