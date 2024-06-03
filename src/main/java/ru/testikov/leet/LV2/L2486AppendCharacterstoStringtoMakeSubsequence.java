package ru.testikov.leet.LV2;

public class L2486AppendCharacterstoStringtoMakeSubsequence {
    public static int appendCharacters(String s, String t) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(count)){
                count++;
            }
            if(count==t.length()) return 0;
        }
        return t.length()-count;
    }

    public static void main(String[] args) {
        String s = "coaching", t = "coding";
        System.out.println(appendCharacters(s,t));
        String a = "lbg", b ="g";
        System.out.println(appendCharacters(a,b));
        String x = "z", y ="abcde";
        System.out.println(appendCharacters(x,y));
    }
}
