package ru.testikov.leet;

import java.util.Stack;

public class L2816DoubleaNumberRepresentedasaLinkedList {
    static public ListNode doubleIt(ListNode head) {
        if (head.next == null && head.val * 2 < 10) {
            head.val = head.val * 2;
            return head;
        }
        if (head.next == null && head.val * 2 >= 10) {
            head.next = new ListNode((head.val * 2) % 10, null);
            head.val = 1;
            return head;
        }

        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode cur = null;
        ListNode prev = null;
        int tmp = 0;

        while (!stack.isEmpty()) {
            if (stack.peek() * 2 < 10) {
                cur = new ListNode(stack.pop() * 2 + tmp, prev);
                prev = cur;
                tmp = 0;
                continue;
            }
            if (stack.peek() * 2 >= 10) {
                cur = new ListNode((stack.pop() * 2) % 10 + tmp, prev);
                prev = cur;
                tmp = 1;
            }
        }

        if (stack.isEmpty() && tmp == 1) {
            cur = new ListNode(tmp, prev);
        }

        return cur;
    }

    // не моё
    public ListNode doubleIt2(ListNode head) {
        Stack<Integer> values = new Stack<>();
        int val = 0;

        while (head != null) {
            values.push(head.val);
            head = head.next;
        }

        ListNode newTail = null;

        while (!values.isEmpty() || val != 0) {
            newTail = new ListNode(0, newTail);
            if (!values.isEmpty()) {
                val += values.pop() * 2;
            }
            newTail.val = val % 10;
            val /= 10;
        }

        return newTail;
    }


    public static void main(String[] args) {
        ListNode big = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode big2 = doubleIt(big);

        System.out.println(big2.val);
        while (big2.next != null) {
            System.out.println(big2.next.val);
            big2 = big2.next;
        }
    }
}
