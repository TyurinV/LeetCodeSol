package ru.testikov.leet;

public class L860LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fives++;
            } else if (bills[i] == 10) {
                if (fives < 1) {
                    return false;
                }
                fives--;
                tens++;
            } else if (bills[i] == 20) {
                if (fives > 0 && tens > 0) {
                    fives--;
                    tens--;
                } else if (fives >= 3) {
                    fives = fives - 3;
                } else {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bls = {5, 5, 5, 10, 20};
        int[] bls2 = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bls));
        System.out.println(lemonadeChange(bls2));
    }
}
