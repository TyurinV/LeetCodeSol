package ru.testikov.leet;

//Given the head of a singly linked list, return true if it is a
//palindrome
// or false otherwise.

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
        StringBuilder sb = new StringBuilder();

        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}

