package ru.testikov.leet.LV3;

import java.util.Arrays;
import java.util.Date;

public class L2706BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return prices[0] + prices[1] > money ? money : money - prices[0] - prices[1];
    }
}
