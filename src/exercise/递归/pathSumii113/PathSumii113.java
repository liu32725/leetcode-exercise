package exercise.递归.pathSumii113;

import com.sun.org.apache.xerces.internal.xs.LSInputList;
import exercise.递归.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumii113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (root.left == null && root.right == null) {
            if(root.val == targetSum) {
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                result.add(list);
                return result;
            } else {
                return result;
            }

        }

        List<List<Integer>> leftResult = pathSum(root.left, targetSum - root.val);
        List<List<Integer>> rightResult = pathSum(root.right, targetSum - root.val);
        for(List<Integer> list : rightResult) {
            list.add(0, root.val);
            result.add(list);
        }
        for(List<Integer> list : leftResult) {
            list.add(0, root.val);
            result.add(list);
        }

        return result;
    }
}
