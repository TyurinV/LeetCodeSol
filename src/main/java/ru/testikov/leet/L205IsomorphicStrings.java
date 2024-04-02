package ru.testikov.leet;

import java.util.HashMap;

public class L205IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "trt"));
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("foo", "tpp"));
    }

    // foo -> trt
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> a = new HashMap<>();
        HashMap<Character, Character> b = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (a.containsKey(s.charAt(i))) {
                if (a.get((s.charAt(i))) != t.charAt(i)) return false;
            }
            a.put(s.charAt(i), t.charAt(i));

            if (b.containsKey(t.charAt(i))) {
                if (b.get((t.charAt(i))) != s.charAt(i)) return false;
            }
            b.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
