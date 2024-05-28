package ru.testikov.leet.LV2;


public class L121BestTimetoBuyandSellStock {
    //сложность n^2 - неприемлемо
    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > result) result = prices[j] - prices[i];
            }
        }
        return result;
    }

    //идём справа налево
    public static int maxProfit2(int[] prices) {
        int max_profit = 0;
        int max_price = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (max_price < prices[i]) max_price = prices[i];
            if (max_price - prices[i] > max_profit) max_profit = max_price - prices[i];
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit2(a));
        int[] c = {1, 2, 4};
        System.out.println(maxProfit2(c));
        int[] b = {7, 6, 4, 3, 1};
        System.out.println(maxProfit2(b));
        int[] f = {1, 2};
        System.out.println(maxProfit2(f));
    }
}
