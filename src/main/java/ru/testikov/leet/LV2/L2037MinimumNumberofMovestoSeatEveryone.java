package ru.testikov.leet.LV2;

import java.util.Arrays;

public class L2037MinimumNumberofMovestoSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int min = 0;
        for (int i = 0; i < seats.length; i++) {
            min += Math.abs(seats[i] - students[i]);
        }
        return min;
    }
}
