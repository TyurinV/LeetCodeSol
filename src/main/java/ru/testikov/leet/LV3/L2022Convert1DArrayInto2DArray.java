package ru.testikov.leet.LV3;

public class L2022Convert1DArrayInto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] a = new int[0][0];
        if (n * m != original.length) return a;
        int count = 0;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[count];
                count++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] b = {3};
        System.out.println(construct2DArray(b, 3, 1));
    }
}
