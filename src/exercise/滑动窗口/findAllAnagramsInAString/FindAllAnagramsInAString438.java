package exercise.滑动窗口.findAllAnagramsInAString;

import java.util.*;

/**
 * 给定两个字符串s和 p，找到s中所有p的异位词的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 *
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 *
 * 示例1:
 *
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 * 示例 2:
 *
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 *
 * 提示:
 *
 * 1 <= s.length, p.length <= 3 * 104
 * s和p仅包含小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-all-anagrams-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindAllAnagramsInAString438 {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> anagrams = findAnagrams(s, p);
        System.out.println(anagrams);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < p.length(); i++) {
            b[p.charAt(i) - 'a']++;
        }
        int l = 0;
        int r = p.length() - 1;
        for (int i = 0; i <= r; i++) {
            a[s.charAt(i) - 'a']++;
        }
        while (r < s.length()) {
            if (Arrays.equals(a, b)) {
                result.add(l);
            }
            if (r == s.length() - 1) {
                break;
            }
            r++;
            l++;
            a[s.charAt(r) - 'a']++;
            a[s.charAt(l) - 'a']--;
        }
        return result;
    }
}
