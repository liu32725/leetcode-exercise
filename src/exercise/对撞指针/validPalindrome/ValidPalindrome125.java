package exercise.对撞指针.validPalindrome;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidPalindrome125 {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int i = 0;
        int j= chars.length -1;
        while (i < j) {
            if (!isLetter(chars[i])) {
                i++;
                continue;
            }
            if (!isLetter(chars[j])) {
                j--;
                continue;
            }
            if (chars[i] == chars[j]) {
                i++;
                j--;
                continue;
            }
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
