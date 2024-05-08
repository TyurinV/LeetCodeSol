package ru.testikov.leet;

import java.util.*;

//Input: score = [10,3,8,9,4]
//Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
//Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

public class L506RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        List<Integer> list = new ArrayList<>();
        for (int a : score) {
            list.add(a);
        }
        List<Integer> sorted = new ArrayList<>(List.copyOf(list));
        Collections.sort(sorted);
        Collections.reverse(sorted);
        for (int i = 0; i < score.length; i++) {
            Integer a = sorted.indexOf(list.get(i));
            if (a == 0) {
                result[i] = "Gold Medal";
                continue;
            }
            if (a == 1) {
                result[i] = "Bronze Medal";
                continue;
            }
            if (a == 2) {
                result[i] = "Silver Medal";
                continue;
            }
            a = a + 1;
            result[i] = a.toString();
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = {10, 3, 8, 9, 4};
        System.out.println(Arrays.asList(findRelativeRanks(a)));
    }
}
