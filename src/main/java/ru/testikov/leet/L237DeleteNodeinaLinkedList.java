package ru.testikov.leet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
//4 -> 5 -> 1 -> 9

public class L237DeleteNodeinaLinkedList {
    public static void deleteNode(ListNode head, ListNode node) {
        while (head.next != null) {
            if (head.next.val == node.val) {
                head.next = head.next.next;
            }
            head = head.next;
        }

    }
//решение по задаче
    public static void deleteNode2(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode ls = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9, null))));

        deleteNode2(ls.next);

        System.out.println(ls.val);
        while (ls.next != null) {
            System.out.println(ls.next.val);
            ls = ls.next;
        }
    }
}
