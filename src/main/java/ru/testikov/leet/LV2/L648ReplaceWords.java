package ru.testikov.leet.LV2;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.reverseOrder;

public class L648ReplaceWords {
    public static String replaceWords(List<String> dictionary, String sentence) {
        dictionary.sort(String::compareTo);
        Collections.reverse(dictionary);
        List<String> sentList = new ArrayList<>(sentence.lines().flatMap(a -> Arrays.stream(a.split(" "))).toList());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < sentList.size(); i++) {
            for (int j = 0; j < dictionary.size(); j++) {
                if (sentList.get(i).startsWith(dictionary.get(j))) {
                    hm.put(i, dictionary.get(j));
                }
            }
        }
        for (Integer a : hm.keySet()) {
            sentList.set(a, hm.get(a));
        }
        for (String a : sentList) {
            sb.append(a + " ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "the cattle was rattled by the battery";
        List<String> a = new ArrayList<>(Arrays.asList("cat", "bat", "rat"));
        System.out.println(replaceWords(a, sentence));
    }
}
