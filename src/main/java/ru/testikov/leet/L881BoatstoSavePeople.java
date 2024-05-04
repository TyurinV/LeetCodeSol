package ru.testikov.leet;

import java.util.Arrays;

public class L881BoatstoSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int last = people.length - 1;
        int current = 0;
        while (current <= last) {
            if (people[current] + people[last] <= limit) {
                current++;
            }
            last--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] a = {1, 2};
//        int[] b = {3, 2, 2, 1};
//        int[] c = {2, 4};
//        int[] d = {5, 1, 4, 2};
        int[] e = {3, 1, 6, 7, 5};
        int[] f = {7, 3, 2};
        int[] g = {5,1,4,2};
        int[] h = {1,2,5,8};
//        System.out.println(numRescueBoats(a, 3) == 1);
//        System.out.println(numRescueBoats(b, 3) == 3);
//        System.out.println(numRescueBoats(c, 5) == 2);
        System.out.println(numRescueBoats(e, 7) == 4);
        System.out.println(numRescueBoats(f, 8) == 2);
        System.out.println(numRescueBoats(g, 6) == 2);
    }
}
