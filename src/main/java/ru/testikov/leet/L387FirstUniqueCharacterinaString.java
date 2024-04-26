package ru.testikov.leet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class L387FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i + 1, s.length()).contains((s.charAt(i)) + "")
                    && !s.substring(0, i).contains((s.charAt(i)) + "")) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        HashMap<Character, Integer> hm = new LinkedHashMap<>();

        for (Character a : s.toCharArray()) {
            hm.put(a, hm.containsKey(a) ? hm.get(a) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> a : hm.entrySet()) {
            if (a.getValue() == 1) return s.indexOf(a.getKey());
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar2("leetcode"));
        System.out.println(firstUniqChar2("loveleetcode"));
        System.out.println(firstUniqChar2("aabb"));
        System.out.println(firstUniqChar2("dddccdbba"));
    }
}
