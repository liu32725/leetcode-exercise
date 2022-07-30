package exercise.链表.removeNthNodeFromEndOfList19;

import exercise.链表.ListNode;

/**
 * 给你一个链表，删除链表的倒数第n个结点，并且返回链表的头结点。
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *
 * 提示：
 *
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 *  
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveNthNodeFromEndOfList19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        ListNode suf = cur;
        for (int i = 1; i <= n; i++) {
            suf = suf.next;
        }
        while (suf.next != null) {
            pre = pre.next;
            cur = pre.next;
            suf = suf.next;
        }
        pre.next = cur.next;
        return dummyHead.next;
    }
}
