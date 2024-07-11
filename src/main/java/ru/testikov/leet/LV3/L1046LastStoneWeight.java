package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L1046LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        Arrays.sort(stones);
        while (stones[stones.length-2] != 0) {
            stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 2] = 0;
            Arrays.sort(stones);
        }
        return Arrays.stream(stones).sum();
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(a));
    }
}


