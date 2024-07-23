package ru.testikov.leet.LV3;

import java.util.*;

public class L1636SortArraybyIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.containsKey(nums[i]) ? hm.get(nums[i]) + 1 : 1);
        }
        class Node implements Comparable<Node> {
            Integer Key;
            Integer Value;

            public Node(int key, int value) {
                Key = key;
                Value = value;
            }

            public int getKey() {
                return Key;
            }

            public int getValue() {
                return Value;
            }

            @Override
            public int compareTo(Node t) {
                int res = this.Value.compareTo(t.Value);
                if (res == 0) {
                    res = t.Key.compareTo(this.Key);
                }
                return res;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "Key=" + Key +
                        ", Value=" + Value +
                        '}';
            }
        }
        List<Node> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> a : hm.entrySet()) {
            list.add(new Node(a.getKey(), a.getValue()));
        }
        list.sort(Node::compareTo);
        System.out.println(list);
        int[] res = new int[nums.length];
        int index = 0;
        for (Node a : list) {
            int count = a.Value;
            while (count > 0) {
                res[index] = a.Key;
                index++;
                count--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 2, 3}; // [3,1,1,2,2,2]
        int[] nums2 = {2,3,1,3,2}; //[1,3,3,2,2]

        System.out.println(Arrays.toString(frequencySort(nums1)));
        System.out.println(Arrays.toString(frequencySort(nums2)));
    }
}
