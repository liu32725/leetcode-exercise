package exercise.链表.partitionList86;

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 *
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 * 示例 2：
 *
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PartitionList86 {

    public static void main(String[] args) {
        ListNode node6 = new ListNode(2, null);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(1, node2);
        System.out.println(node1);
        System.out.println(partition(node1, 3));
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode leftNode = new ListNode(0);
        ListNode leftHead = leftNode;
        ListNode rightNode = new ListNode(0);
        ListNode rightHead = rightNode;
        while (head != null) {
            if (head.val >= x) {
                rightNode.next = head;
                rightNode = rightNode.next;
            } else {
                leftNode.next = head;
                leftNode = leftNode.next;
            }
            head = head.next;
        }
        rightNode.next = null;
        leftNode.next = rightHead.next;
        return leftHead.next;
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
