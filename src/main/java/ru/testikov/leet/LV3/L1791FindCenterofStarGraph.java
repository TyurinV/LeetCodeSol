package ru.testikov.leet.LV3;

public class L1791FindCenterofStarGraph {
    public int findCenter(int[][] edges) {
        int lengthEdges = edges.length;
        int hightEdges = edges[0].length;
        for (int i = 0; i < hightEdges; i++) {
            int a = edges[0][i];
            for (int j = 0; j < lengthEdges; j++) {
                if (a == edges[1][j]) return a;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int edges[][] =
                {{1, 2},
                        {2, 3},
                        {4, 2}};
    }
}
