package exercise.递归.countCompleteTreeNodes222;

import exercise.递归.TreeNode;

public class CountCompleteTreeNodes222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }


        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }
}
