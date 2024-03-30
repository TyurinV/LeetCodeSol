package ru.testikov.leet;

import java.util.List;
import java.util.Stack;

public class L1047RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!st.empty() && st.peek() == s.charAt(i)) {
                st.pop();
            } else st.push(s.charAt(i));
        }
        for (Character c : st) {
            sb.append(c);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        L1047RemoveAllAdjacentDuplicatesInString l1 = new L1047RemoveAllAdjacentDuplicatesInString();
        System.out.println(l1.removeDuplicates("abbaca"));
    }
}
