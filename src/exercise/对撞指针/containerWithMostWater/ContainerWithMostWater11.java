package exercise.对撞指针.containerWithMostWater;

/**
 * 给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。
 *
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为49。
 * 示例 2：
 *
 * 输入：height = [1,1]
 * 输出：1
 *
 *
 * 提示：
 *
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class ContainerWithMostWater11 {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = maxArea(height);
        System.out.println(maxArea);
    }

    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int maxArea = 0;
        int i =0;
        int j = height.length - 1;
        while (i < j) {
            if (height[i] > height[j]) {
                int l = j - i;
                int h = height[j];
                maxArea = maxArea > h * l ? maxArea : h * l;
                j--;
            } else {
                int l = j - i;
                int h = height[i];
                maxArea = maxArea > h * l ? maxArea : h * l;
                i++;
            }
        }
        return maxArea;
    }
}
