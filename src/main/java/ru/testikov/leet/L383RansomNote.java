package ru.testikov.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L383RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char a : magazine.toCharArray()) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (char b : ransomNote.toCharArray()) {
            if (map.containsKey(b)) {
                map.put(b, map.get(b) - 1);
            } else return false;
        }

        for (int x : map.values()) {
            if (x < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("axa", "aabx"));

    }
}
