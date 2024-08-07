package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L3232FindifDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int oneDigi = Arrays.stream(nums).filter(value -> value < 10).sum();
        int twoDigi = Arrays.stream(nums).sum() - oneDigi;
        return oneDigi != twoDigi;
    }
}
