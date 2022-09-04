package exercise.递归.balancedBinaryTree110;

import exercise.递归.TreeNode;

public class BalancedBinaryTree110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        int depthDiff = rightDepth > leftDepth ? rightDepth - leftDepth : leftDepth - rightDepth;
        if (depthDiff > 1) {
            return false;
        }
        boolean leftBalanced = isBalanced(root.left);
        boolean rightBalanced = isBalanced(root.right);
        return leftBalanced && rightBalanced;

    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return 1 + (rightDepth > leftDepth ? rightDepth : leftDepth);
    }
}
