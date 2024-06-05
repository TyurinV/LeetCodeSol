package ru.testikov.leet.LV2;

import java.util.ArrayList;
import java.util.List;

public class L1002FindCommonCharacters {
    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        char[] charArray = words[0].toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            for (int j = 1; j < words.length; j++) {
                if (words[j].indexOf(charArray[i]) != -1) {
                    count++;
                    words[j] = words[j].substring(0, words[j].indexOf(charArray[i])) + words[j].substring(words[j].indexOf(charArray[i])+1);
                }
            }
            if (count == words.length - 1) {
                result.add(String.valueOf(charArray[i]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str1 = {"bella", "label", "roller"};
        String[] str2 = {"cool", "lock", "cook"};
        System.out.println(commonChars(str1));
        System.out.println(commonChars(str2));

        String a = "Cool";
        a = a.replace("o","");
        System.out.println(a);
    }
}
