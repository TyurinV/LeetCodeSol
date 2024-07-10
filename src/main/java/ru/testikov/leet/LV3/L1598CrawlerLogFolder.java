package ru.testikov.leet.LV3;

public class L1598CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        int res = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("./")) {
                continue;
            }
            if (logs[i].equals("../")) {
                res = (res <= 0) ? 0 : (res - 1);
            } else {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        String[] a = {"d1/","d2/","../","d21/","./"};
//        String[] b = {"d1/","d2/","./","d3/","../","d31/"};
        String[] c = {"d1/", "../", "../", "../"};
        System.out.println(minOperations(c));
//        System.out.println(minOperations(b));
    }
}
