package ru.testikov.leet.LV3;

public class L2000ReversePrefixofWord {
    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) < 0) return word;
        int indx = word.indexOf(ch);
        StringBuilder sb1 = new StringBuilder(word.substring(0, indx+1));
        StringBuilder sb2 = new StringBuilder(word.substring(indx+1, word.length()));
        return (sb1.reverse().toString() + sb2);
    }
}
