package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] takes = new boolean[nums.length];
        permute(nums, takes, 0, new ArrayList<>());
        return result;
    }
    private void permute(int[] nums, boolean[] takes, int index, List<Integer> list) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if (takes[i]) {
                continue;
            }
            takes[i] = true;
            list.add(nums[i]);
            permute(nums, takes, index + 1, list);
            list.remove(list.size() - 1);
            takes[i] = false;
        }
    }
}
