package exercise.递归.binaryTreePaths257;

import exercise.递归.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (root.left == null && root.right == null) {
            result.add(String.valueOf(root.val));
            return result;
        }

        List<String> leftResult = binaryTreePaths(root.left);
        List<String> rightResult = binaryTreePaths(root.right);
        for(String str : leftResult) {
            result.add(root.val + "->" + str);
        }
        for(String str : rightResult) {
            result.add(root.val + "->" + str);
        }
        return result;
    }
}
