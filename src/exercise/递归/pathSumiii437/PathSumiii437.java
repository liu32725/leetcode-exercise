package exercise.递归.pathSumiii437;

import exercise.递归.TreeNode;

public class PathSumiii437 {


    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int rootSum = rootSum(root, targetSum);
        int leftSum = pathSum(root.left, targetSum);
        int rightSum = pathSum(root.right, targetSum);
        return rootSum + leftSum + rightSum;
    }

    private int rootSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (root.val == targetSum) {
            result++;
        }

        result = result + rootSum(root.left, targetSum - root.val);
        result = result + rootSum(root.right, targetSum - root.val);
        return result;
    }

}
