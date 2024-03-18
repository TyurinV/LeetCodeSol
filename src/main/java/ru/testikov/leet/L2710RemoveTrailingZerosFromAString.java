package ru.testikov.leet;

public class L2710RemoveTrailingZerosFromAString {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("5550001"));
    }

    public static String removeTrailingZeros(String num) {
        int counter = 0;
        char[] charArray = num.toCharArray();
        for (int i = charArray.length - 1; i > 0; i--) {
            if (charArray[i] == '0') {
                counter++;
            } else break;
        }

        return num.substring(0, charArray.length - counter);
    }

    public static String removeTrailingZeros1(String num) {
        int i = num.length() - 1;
        while (i >= 0 && num.charAt(i) == '0') {
            i--;
        }
        return num.substring(0, i + 1);
    }
}
