package exercise.递归.sumRootToLeafNumbers129;

import exercise.递归.TreeNode;

public class SumRootToLeafNumbers129 {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) {
            return sum;
        }

        int leftResult = sumNumbers(root.left, sum);
        int rightResult = sumNumbers(root.right, sum);
        return leftResult + rightResult;
    }
}
