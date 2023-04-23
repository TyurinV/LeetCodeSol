package ru.testikov.leet;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class L1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if ((nums[i] + nums[j] == target) && (i!=j)) {
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++ ){
            map.put(nums[i], i);
        }

        for (int i = 0; i< nums.length; i++ ){
            int reqNum = target - nums[i];
            if (map.containsKey(reqNum) && map.get(reqNum) != i){
                return new int[] {i, map.get(reqNum)};
            }
        }
        throw new IllegalArgumentException("ВАСЯЯЯЯЯ");
    }

    public static void main(String[] args) {
        int[] a = {2,5,5,11};
        System.out.println(Arrays.toString(new L1TwoSum().twoSum(a, 10)));
    }
}
