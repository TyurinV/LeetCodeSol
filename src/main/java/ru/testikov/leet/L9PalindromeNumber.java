package ru.testikov.leet;

public class L9PalindromeNumber {
    public boolean isPalindrome(int x) {
        Long y = (long) x;
        if (x < 0) return false;
        StringBuilder a = new StringBuilder(y.toString());
        y = Long.parseLong(String.valueOf(a.reverse()));
        return x-y == 0;
    }

    public static void main(String[] args) {
        System.out.println(new L9PalindromeNumber().isPalindrome(545));
        System.out.println(new L9PalindromeNumber().isPalindrome(5455));
        System.out.println(new L9PalindromeNumber().isPalindrome(123321));
    }
}
