package ru.testikov.leet;

import java.util.Stack;

public class L1614MaximumNestingDepthoftheParentheses {
    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        int tmp = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                tmp += 1;
            }
            if (stack.peek() == ')') {
                tmp -= 1;
            }
            if (tmp > max) {
                max = tmp;
            }
            stack.pop();
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
    }
}
