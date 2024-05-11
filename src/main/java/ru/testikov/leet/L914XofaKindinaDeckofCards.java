package ru.testikov.leet;

import java.util.*;

public class L914XofaKindinaDeckofCards {

    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) return false;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            hm.put(deck[i], hm.containsKey(deck[i]) ? hm.get(deck[i]) + 1 : 1);
        }

        int res = hm.get(deck[0]);
//акглоритм евклида
        for (int a : hm.values()) {
            while (a != 0) {
                int ostatok = res % a;
                res = a;
                a = ostatok;
            }
        }

        return res >= 2;
    }

    public static void main(String[] args) {

        int[] deck = {1, 2, 3, 4, 4, 3, 2, 1}; //true
        System.out.println(hasGroupsSizeX(deck));

        int[] deck2 = {1, 1, 1, 2, 2, 2, 3, 3}; // false
        System.out.println(hasGroupsSizeX(deck2));
        int[] deck3 = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3}; //true
        System.out.println(hasGroupsSizeX(deck3));
        int[] deck4 = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2}; // true
        System.out.println(hasGroupsSizeX(deck4));
        int[] deck42 = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3}; // true
        System.out.println("deck42 is " + hasGroupsSizeX(deck42));
        int[] deck5 = {0, 0, 1, 1, 1, 1, 2, 2, 3, 4}; //false
        System.out.println(hasGroupsSizeX(deck5));
        int[] deck6 = {1, 1, 1, 1, 1, 0, 0, 0}; //false
        System.out.println(hasGroupsSizeX(deck6));
        int[] deck7 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7}; //true
        System.out.println(hasGroupsSizeX(deck7)); //true
    }
}
