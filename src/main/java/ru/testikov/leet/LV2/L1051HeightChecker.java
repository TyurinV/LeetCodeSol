package ru.testikov.leet.LV2;

import java.util.Arrays;

public class L1051HeightChecker {
    class Solution {
        public int heightChecker(int[] heights) {
            int[] newHeights = heights.clone();
            Arrays.sort(newHeights);
            int count = 0;
            for (int i = 0; i < newHeights.length; i++) {
                if(heights[i] != newHeights[i]) count++;
            }
            return count;
        }
    }
}
