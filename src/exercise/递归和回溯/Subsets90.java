package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets90 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        find(nums, 0, new ArrayList<>());
        return result;
    }

    private void find(int[] nums, int index, List<Integer> list) {
        for(int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            find(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
