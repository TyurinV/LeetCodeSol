package ru.testikov.leet;

public class L58LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        String a = "Hello World";
        String b = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(a));
        System.out.println(lengthOfLastWord(b));
    }
}
