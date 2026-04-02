// Last updated: 4/2/2026, 3:50:45 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int len = 1;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            len ++;
        }

        k = k % len;
        if (k == 0) return head;

        int newTailIdx = len - k - 1;
        int newHeadIdx = len - k;

        cur.next = head;
        int idx = 0;
        while (idx <= newTailIdx) {
            cur = cur.next;
            idx ++;
        }

        ListNode newHead = cur.next;
        cur.next = null;
        return newHead;
    }
}