package ru.testikov.leet;

public class L2455AverageValueofEvenNumbersThatAreDivisiblebyThree {
    public static int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                count++;
                sum += nums[i];
            }
        }
        return sum == 0 ? 0: sum/count;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 10, 12, 15};
        int[] b = {1, 2, 4, 7, 10};
        //6+12 = 18 / 2 = 9
        System.out.println(averageValue(a));


        // 0
        System.out.println(averageValue(b));
    }

}
