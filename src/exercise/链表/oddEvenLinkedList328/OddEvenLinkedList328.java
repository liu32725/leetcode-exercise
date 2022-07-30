package exercise.链表.oddEvenLinkedList328;

import exercise.链表.partitionList86.PartitionList86;
import exercise.链表.removeDuplicatesFromSortedList.removeDuplicatesFromSortedList83;

/**
 * 给定单链表的头节点head，将所有索引为奇数的节点和索引为偶数的节点分别组合在一起，然后返回重新排序的列表。
 *
 * 第一个节点的索引被认为是 奇数 ， 第二个节点的索引为偶数 ，以此类推。
 *
 * 请注意，偶数组和奇数组内部的相对顺序应该与输入时保持一致。
 *
 * 你必须在O(1)的额外空间复杂度和O(n)的时间复杂度下解决这个问题。
 *
 *
 * 示例 1:
 *
 *
 *
 * 输入: head = [1,2,3,4,5]
 * 输出:[1,3,5,2,4]
 * 示例 2:
 *
 *
 *
 * 输入: head = [2,1,3,5,6,4,7]
 * 输出: [2,3,6,7,1,5,4]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/odd-even-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OddEvenLinkedList328 {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        System.out.println(node1);
        System.out.println(oddEvenList(node1));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddList = new ListNode(0);
        ListNode oddHead = oddList;
        ListNode evenList = new ListNode(0);
        ListNode evenHead = evenList;
        ListNode cur = head;
        int index = 0;
        while (cur != null) {
            index++;
            if (index % 2 != 0) {
                oddList.next = cur;
                oddList = oddList.next;
            } else {
                evenList.next = cur;
                evenList = evenList.next;
            }
            cur = cur.next;
        }
        evenList.next = null;
        oddList.next = evenHead.next;
        return oddHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return val + "->" + (next == null ? "NULL" : next.toString());
        }
    }

}
