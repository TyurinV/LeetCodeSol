package ru.testikov.leet;

public class L2114MaximumNumberofWordsFoundinSentences {

    public static int mostWordsFound(String[] sentences) {
        int wordsCounter = 0;

        for (int i = 0; i < sentences.length; i++) {
            int countOfFrases = sentences[i].split(" ").length;
            if (countOfFrases >= wordsCounter) {
                wordsCounter = countOfFrases;
            }
        }

        return wordsCounter;
    }


    public static void main(String[] args) {
        String[] a = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] b = new String[]{"please wait","continue to fight","continue to win"};
        System.out.println(mostWordsFound(a));
        System.out.println(mostWordsFound(b));
    }
}
