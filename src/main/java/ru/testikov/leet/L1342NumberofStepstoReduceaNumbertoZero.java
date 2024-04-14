package ru.testikov.leet;

public class L1342NumberofStepstoReduceaNumbertoZero {

    public static int numberOfSteps(int num) {
        int step = 0;
        while (num > 0)
            if (num % 2 == 0) {
                num = num / 2;
                step++;
            } else {
                num = num - 1;
                step++;
            }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }
}
