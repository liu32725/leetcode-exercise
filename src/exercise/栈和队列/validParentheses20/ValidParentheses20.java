package exercise.栈和队列.validParentheses20;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParentheses20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (!pop.equals('{')) {
                    return false;
                }
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (!pop.equals('(')) {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (!pop.equals('[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
