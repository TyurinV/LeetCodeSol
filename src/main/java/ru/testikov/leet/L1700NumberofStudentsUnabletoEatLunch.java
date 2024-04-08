package ru.testikov.leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class L1700NumberofStudentsUnabletoEatLunch {
    public static void main(String[] args) {
        int[] st = {1, 1, 0, 0};
        int[] sndch = {0, 1, 0, 1};
        System.out.println(countStudents(st, sndch));

        int[] st2 = {1,1,1,0,0,1};
        int[] sndch2 = {1,0,0,0,1,1};
        System.out.println(countStudents(st2, sndch2));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> std = new ArrayDeque<>();
        Deque<Integer> sndw = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            sndw.add(sandwiches[i]);
            std.add(students[i]);
        }
        int counter = std.size();
        while (counter >= 0) {
            if (sndw.getFirst() == std.getFirst()) {
                sndw.removeFirst();
                std.removeFirst();
                counter = std.size();
            } else {
                std.addLast(std.removeFirst());
            }
            counter--;
        }
        return std.size();
    }
}
