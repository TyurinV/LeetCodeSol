package ru.testikov.leet.LV3;

import java.util.*;
import java.util.stream.Collectors;

public class L2418SortthePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> hm = new TreeMap<>((o1, o2) -> o2-o1);
        for (int i = 0; i < names.length; i++) {
            hm.put(heights[i], names[i]);
        }
        System.out.println(hm.values());
        int count = 0;
        String[] resultNames = new String[heights.length];
        for (String a : hm.values()) {
            resultNames[count] = a;
            count++;
        }
        return resultNames;
    }

    public static void main(String[] args) {
        String[] name = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(sortPeople(name, heights));
    }
}
