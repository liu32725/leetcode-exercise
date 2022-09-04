package exercise.递归.pathSum112;

import exercise.递归.TreeNode;

public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        boolean leftHas = hasPathSum(root.left, targetSum - root.val);
        if (leftHas) {
            return true;
        }
        boolean rightHas = hasPathSum(root.right, targetSum - root.val);
        return rightHas;
    }
}
