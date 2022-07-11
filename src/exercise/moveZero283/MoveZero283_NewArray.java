package exercise.moveZero283;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class MoveZero283_NewArray {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0) {
                return;
            }
            int[] array = new int[nums.length];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    array[index] = nums[i];
                    index++;
                }
            }
            for (; index < array.length; index++) {
                array[index] = 0;
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = array[i];
            }
        }

    }
}
