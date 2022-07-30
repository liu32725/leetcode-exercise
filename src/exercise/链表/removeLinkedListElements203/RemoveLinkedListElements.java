package exercise.链表.removeLinkedListElements203;

import exercise.链表.ListNode;
import exercise.链表.removeDuplicatesFromSortedList.removeDuplicatesFromSortedList83;

/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * 示例 2：
 *
 * 输入：head = [], val = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-linked-list-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        System.out.println(node1);
        System.out.println(removeElements(node1, 2));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode cur = dummyHead;
        while (cur.next != null) {
            ListNode next = cur.next;
            if (next.val == val) {
                cur.next = next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
