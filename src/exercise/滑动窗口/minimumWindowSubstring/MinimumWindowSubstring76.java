package exercise.滑动窗口.minimumWindowSubstring;

/**
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。
 * 如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 *
 * 注意：
 *
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 *
 * 示例 1：
 *
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 示例 2：
 *
 * 输入：s = "a", t = "a"
 * 输出："a"
 * 示例 3:
 *
 * 输入: s = "a", t = "aa"
 * 输出: ""
 * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
 * 因此没有符合条件的子字符串，返回空字符串。
 *
 * 提示：
 *
 * 1 <= s.length, t.length <= 105
 * s 和 t 由英文字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-window-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinimumWindowSubstring76 {

    public static void main(String[] args) {
//        String s = "ADOBECODEBANC", t = "ABC";
        // ""cgklivwehljxrdzpfdqsapogwvjtvbzahjnsejwnuhmomlfsrvmrnczjzjevkdvroiluthhpqtffhlzyglrvorgnalk"
        //"mqfff""
        //"cae"
        String s = "cgklivwehljxrdzpfdqsapogwvjtvbzahjnsejwnuhmomlfsrvmrnczjzjevkdvroiluthhpqtffhlzyglrvorgnalk", t = "a";
        String result = minWindow(s, t);
        System.out.println(result);
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] tCharArr = new int[58];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tCharArr[c - 'A']++;
        }
        int l = 0;
        int r = -1;
        String result = s;
        boolean isChanged = false;
        while (l < s.length()) {
            if (r+1 < s.length() && !findTStrInWindow(tCharArr)) {
                r++;
                int index = s.charAt(r) - 'A';
                tCharArr[index]--;
            } else {
                int index = s.charAt(l) - 'A';
                l++;
                tCharArr[index]++;
            }


            if (result.length() >= r-l+1 && findTStrInWindow(tCharArr)) {
                result = s.substring(l, r+1);
                isChanged = true;
            }
        }
        return isChanged ? result : "";
    }

    private static boolean findTStrInWindow(int[] tCharArr) {
        for (int i = 0; i < tCharArr.length; i++) {
            if (tCharArr[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
