package ru.testikov.leet.LV3;

import java.util.Arrays;

public class L2678NumberofSeniorCitizens {
    public static int countSeniors(String[] details) {
        return (int) Arrays.stream(details)
                .mapToInt(value -> Integer.parseInt(value.substring(11, 13)))
                .filter(value -> value > 60)
                .count();
    }

    public static void main(String[] args) {
        String[] a = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        System.out.println(countSeniors(a));
    }
}
