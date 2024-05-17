package ru.testikov.leet;

public class L35SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] > target && nums[i - 1] < target) return i;
        }
        if (nums[nums.length - 1] < target) return nums.length;
        return -1;
    }

    //1, 3, 5, 6 t5
    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) return mid;
            if (target > nums[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        System.out.println(searchInsert2(nums1, 5)); //2
        int[] nums2 = {1, 3, 5, 6};
        System.out.println(searchInsert2(nums2, 2)); //1
        int[] nums3 = {1, 3, 5, 6};
        System.out.println(searchInsert2(nums3, 7)); //4
        int[] nums4 = {2, 3, 5, 6};
        System.out.println(searchInsert2(nums4, 1)); //0
        int[] nums5 = {1};
        System.out.println(searchInsert2(nums5, 1)); //0
    }
}
