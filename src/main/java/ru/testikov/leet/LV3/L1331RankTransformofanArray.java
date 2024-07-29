package ru.testikov.leet.LV3;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

//Input: arr = [40,10,20,30]
//Output: [4,1,2,3]
public class L1331RankTransformofanArray {
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] sotred = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sotred);
        int count = 1;
        for (int i = 0; i < sotred.length; i++) {
            if (!hm.containsKey(sotred[i])) {
                hm.put(sotred[i], count);
                count++;
            }
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = hm.get(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {40, 22, 22, 1};
        System.out.println(Arrays.toString(arrayRankTransform(arrayRankTransform(a))));
    }
}
