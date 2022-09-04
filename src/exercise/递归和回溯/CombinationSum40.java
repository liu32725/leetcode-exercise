package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum40 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        find(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void find(int[] candidates, int target, int index, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        for(int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            list.add(candidates[i]);
            find(candidates, target - candidates[i], i + 1, list);
            list.remove(list.size() - 1);

        }
    }
}
