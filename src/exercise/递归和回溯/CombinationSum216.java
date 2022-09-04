package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum216 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int target) {
        find(k, target, 1, new ArrayList<>());
        return result;
    }

    private void find(int k, int target, int index, List<Integer> list) {
        if (list.size() > k) {
            return;
        }
        if(target == 0) {
            if (list.size() == k) {
                result.add(new ArrayList<>(list));
                return;
            } else {
                return;
            }
        }
        for(int i = index; i <= 9; i++) {
            list.add(i);
            find(k, target - i, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
