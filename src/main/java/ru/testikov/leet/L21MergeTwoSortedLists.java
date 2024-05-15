package ru.testikov.leet;


public class L21MergeTwoSortedLists {
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] tst = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] tst2 = {0, 0, 1};
        System.out.println(removeDuplicates(tst));
        System.out.println(removeDuplicates(tst2));
    }
}

