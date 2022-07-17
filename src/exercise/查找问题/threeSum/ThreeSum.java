package exercise.查找问题.threeSum;

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，
 * 使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 *
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：[]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            List<List<Integer>> result = findTargetInNums(nums, target, i);
            if (result.size() != 0) {
                for (List<Integer> list : result) {
                    list.add(nums[i]);
                    lists.add(list);
                }
            }
        }
        return lists;
    }

    private static List<List<Integer>> findTargetInNums(int[] nums, int target, int exclude) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == exclude) {
                continue;
            }
            int t = target - nums[i];
            if (map.get(t) != null) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(t);
                lists.add(list);
            }
            map.put(nums[i], i);
        }
        return lists;
    }
}
