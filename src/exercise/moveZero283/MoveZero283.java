package exercise.moveZero283;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class MoveZero283 {

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
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 0 && j < nums.length - 1) {
                        swap(nums, j, j + 1);
                    }
                }
            }
        }

        private void swap(int[] nums, int j, int i) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }


    }
}
