package ru.testikov.leet.LV3;

public class L2124CheckifAllAsAppearsBeforeAllBs {
    public static boolean checkString(String s) {
        if ((s.contains("a") && !s.contains("b")) || (!s.contains("a") && s.contains("b"))) return true;
        int a = 0;
        int b = 0;
        boolean bFlag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b' && bFlag) {
                b = i;
                bFlag = false;
            }
            if (s.charAt(i) == 'a') {
                a = i;
            }
        }
        return a < b;
    }

    ////ВАУ
    public static boolean checkString2(String s) {
        return !s.contains("ba");
    }

    public static void main(String[] args) {
        String s = "abab"; // false
        String b = "bbbb"; //true
        String c = "aaabbb"; // true
        System.out.println(checkString2(s));
        System.out.println(checkString2(b));
        System.out.println(checkString2(c));
    }
}
