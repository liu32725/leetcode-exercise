package exercise.链表.removeDuplicatesFromSortedList;


/**
 * 给定一个已排序的链表的头head，删除所有重复的元素，使每个元素只出现一次。返回 已排序的链表。
 *
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 * 示例 2：
 *
 *
 * 输入：head = [1,1,2,3,3]
 * 输出：[1,2,3]
 *
 * 提示：
 *
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序 排列
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class removeDuplicatesFromSortedList83 {


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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        int count = 1;
        while (cur.next != null) {
            ListNode next = cur.next;
            if (next.val == cur.val) {
                count++;
            }
            if (next.val != cur.val) {
                count = 0;
                cur = next;
            }
            if (count > 1) {
                cur.next = next.next;
                next.next = null;
            }

        }

        return head;
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
