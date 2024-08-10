package ru.testikov.leet.LV3;

import java.util.Deque;
import java.util.LinkedList;

public class L3210FindtheEncryptedString {
    public static String getEncryptedString(String s, int k) {
        Deque<Character> dq = new LinkedList<>();
        for (char a : s.toCharArray()){
            dq.addLast(a);
        }
        for (int i = 0; i < k; i++) {
            dq.addLast(dq.removeFirst());
        }
        StringBuilder sb = new StringBuilder();
        for (char a : dq){
            sb.append(a);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getEncryptedString("dart", 3));
    }
}
