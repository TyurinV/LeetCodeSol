package ru.testikov.leet;

public class L1572MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        if (mat.length == 1) return mat[0][0];
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] tst = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(tst));
        int[][] tst2 =
                {{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}};

        System.out.println(diagonalSum(tst2));
    }

}
