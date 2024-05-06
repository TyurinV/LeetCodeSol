package ru.testikov.leet;

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
public class L2566MaximumDifferencebyRemappingaDigit {
    public static int minMaxDifference(int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                sb.append(s.replace(s.charAt(i), '9'));
                break;
            }
            if (i == s.length() - 1) {
                sb.append(s);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                sb2.append(s.replace(s.charAt(i), '0'));
                break;
            }
            if (i == s.length() - 1) {
                sb2.append('0');
            }

        }
        return Integer.valueOf(sb.toString()) - Integer.valueOf(sb2.toString());
    }

    public static void main(String[] args) {
        System.out.println(minMaxDifference(99999));
    }
}
