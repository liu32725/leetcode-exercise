package exercise.链表.palindromeLinkedList234;

import exercise.链表.ListNode;
import exercise.链表.reverseLinkedList206.ReverseLinkedList206;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,2,1]
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：head = [1,2]
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PalindromeLinkedList234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        int mid = 0;
        if (length % 2 == 0) {
            mid = length / 2;
        } else {
            mid = length / 2 + 1;
        }
        ListNode leftHead = head;
        ListNode rightHead = null;
        cur = head;
        for (int i = 0; i < mid; i++) {
            cur = cur.next;
        }
        rightHead = reverseList(cur);
        ListNode leftCur = leftHead;
        ListNode rightCur = rightHead;
        while (rightCur != null) {
            if (leftCur.val == rightCur.val) {
                leftCur = leftCur.next;
                rightCur = rightCur.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
