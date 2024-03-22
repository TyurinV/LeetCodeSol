package ru.testikov.leet;

//Given the head of a singly linked list, return true if it is a
//palindrome
// or false otherwise.

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class L234PalindromeLinkedList {
    static ListNode ln = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
    static ListNode ln2 = new ListNode(1, new ListNode(2, null));

    public static void main(String[] args) {
        System.out.println(isPalindrome(ln));
        System.out.println(isPalindrome(ln2));
    }

    //решение
    public static boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right && arr.get(left) == arr.get(right)) {
            left++;
            right--;
        }


        return left >= right;
    }
}

