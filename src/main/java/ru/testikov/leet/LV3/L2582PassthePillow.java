package ru.testikov.leet.LV3;

public class L2582PassthePillow {
    public static int passThePillow(int n, int time) {
        if (time < n) return time + 1;
        if ((time / (n - 1) % 2 == 1)) return n - (time % (n - 1));
        return time % (n - 1) + 1;
    }



    public static void main(String[] args) {
        System.out.println(passThePillow(8, 9)); // ждём 6
        System.out.println(passThePillow(18, 38)); // ждём 5 // 17 + 17 = 34. 38 - 34 = 4
        System.out.println(passThePillow(4, 5));
        System.out.println(passThePillow(4, 9)); // 4 Ждём
        System.out.println(passThePillow(3, 2));
    }
}
