package exercise.递归.commonAncestor235;

import exercise.递归.TreeNode;

/**
 * https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/submissions/
 */
public class CommonAncestor235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p.val > q.val) {
            TreeNode temp = q;
            q = p;
            p = temp;
        }
        if (root.val >= p.val && root.val <= q.val) {
            return root;
        }
        if (root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else  {
            return lowestCommonAncestor(root.left, p, q);
        }
    }
}
