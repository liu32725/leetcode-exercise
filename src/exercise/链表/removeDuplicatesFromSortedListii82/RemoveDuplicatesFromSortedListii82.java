package exercise.链表.removeDuplicatesFromSortedListii82;

import exercise.链表.ListNode;
import exercise.链表.removeDuplicatesFromSortedList.removeDuplicatesFromSortedList83;

/**
 * 给定一个已排序的链表的头head ，删除原始链表中所有重复数字的节点，只留下不同的数字。返回 已排序的链表。
 *
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 * 示例 2：
 *
 *
 * 输入：head = [1,1,1,2,3]
 * 输出：[2,3]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveDuplicatesFromSortedListii82 {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(3, null);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);
        System.out.println(node1);
        System.out.println(deleteDuplicates(node1));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(-1000, head);
        ListNode cur = dummyHead;
        ListNode preNode = dummyHead;
        while (cur.next != null) {
            ListNode next = cur.next;
            if (next.val == cur.val) {
                cur = cur.next;
            } else {

                preNode.next = cur;
                cur = preNode.next.next;
                preNode.next.next = null;
            }
        }
        return dummyHead.next;
    }

}
