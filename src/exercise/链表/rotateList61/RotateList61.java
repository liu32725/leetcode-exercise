package exercise.链表.rotateList61;

import exercise.链表.ListNode;

/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动k个位置。
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 * 示例 2：
 *
 *
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RotateList61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        k = k %length;
        ListNode[] nodes = new ListNode[k];
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < k; i++) {
            q = q.next;
        }
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        for (int i = 0; i < k; i++) {
            nodes[i] = p.next;
            ListNode next = p.next;
            p.next = null;
            p = next;
        }
        for (int i = nodes.length - 1; i >= 0; i--) {
            ListNode node = nodes[i];
            node.next = head;
            head = node;
        }
        return head;
    }
}
