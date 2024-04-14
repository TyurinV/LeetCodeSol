package ru.testikov.leet;

public class L404SumofLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.left.left == null & root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }


    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode();
        treeNode.val = 3;
        treeNode.left = new TreeNode(9, null, null);
        treeNode.right = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));

        System.out.println(sumOfLeftLeaves(treeNode));

    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}