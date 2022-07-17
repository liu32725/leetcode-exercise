package exercise.滑动窗口.minimumSizeSubarraySum;

/**
 * 给定一个含有n个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * 示例 1：
 *
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组[4,3]是该条件下的长度最小的子数组。
 * 示例 2：
 *
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 *
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 *
 * 提示：
 *
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinimumSizeSubarraySum209 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int len = minSubArrayLen(7, nums);
        System.out.println(len);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = -1;
        int sum = 0;
        int result = nums.length + 1;
        while (l < nums.length) {
            if (r + 1 < nums.length && target >= sum) {
                r++;
                sum = sum + nums[r];
            } else {
                sum = sum - nums[l];
                l++;
            }
            if (sum >= target) {
                result = result > r-l+1 ? r - l +1 : result;
            }
        }
        if (result == nums.length + 1) {
            return 0;
        }
        return result;
    }
}
