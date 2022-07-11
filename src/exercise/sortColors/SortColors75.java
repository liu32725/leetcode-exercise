package exercise.sortColors;

import java.util.Arrays;

/**
 * 给定一个包含红色、白色和蓝色、共n 个元素的数组nums，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 *
 * 必须在不使用库的sort函数的情况下解决这个问题。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 示例 2：
 *
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/sort-colors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortColors75 {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int zeroIndex = 0; // [0, zeroIndex) == 0
        int twoIndex = nums.length -1; // (nums.length-1, nums.length-1] == 2
        for (int i = 0; i <= twoIndex;) {
            if (nums[i] == 0) {
                swap(nums, zeroIndex, i);
                zeroIndex++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, twoIndex, i);
                twoIndex--;
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
