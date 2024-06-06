package ru.testikov.leet.LV2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
 * Output: true
 * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
 */
//Не лучшее решение!!!!
public class L846HandofStraights {
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        if (groupSize == 1) return true;
        List<Integer> list = new ArrayList<>();
        for (int a : hand) {
            list.add(a);
        }

        if (hand.length / groupSize == 1) {
            int min = list.stream().min(Integer::compareTo).get();
            for (int i = 0; i < hand.length; i++) {
                if (list.contains(min)) {
                    list.remove((Integer) min);
                    min++;
                } else return false;
            }
            return true;
        }

        for (int i = 0; i < hand.length / groupSize; i++) {
            int min = list.stream().min(Integer::compareTo).get();
            for (int j = 0; j < groupSize; j++) {
                if (list.contains(min)) {
                    list.remove((Integer) min);
                } else return false;
                min++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] hand = {1, 5};
        System.out.println(isNStraightHand(hand, 1));
    }
}
