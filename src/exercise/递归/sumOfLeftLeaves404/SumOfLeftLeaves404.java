package exercise.递归.sumOfLeftLeaves404;

import exercise.递归.TreeNode;

public class SumOfLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftsSum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftsSum = root.left.val;
        }

        int leftSum = leftsSum + sumOfLeftLeaves(root.left);
        int rightSum = sumOfLeftLeaves(root.right);

        return leftSum + rightSum;
    }
}
