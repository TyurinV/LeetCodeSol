package ru.testikov.leet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class L2073TimeNeededtoBuyTickets {

    //    Input: tickets = [2,3,2], k = 2
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int countTimeSecond = 0;
        while (tickets[k] > 0)
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    countTimeSecond++;
                }
                if (tickets[k] == 0) break;
            }

        return countTimeSecond;
    }

    public static void main(String[] args) {
        int[] rr = new int[]{84, 49, 5, 24, 70, 77, 87, 8};

        System.out.println(timeRequiredToBuy(rr, 3));
    }
}
