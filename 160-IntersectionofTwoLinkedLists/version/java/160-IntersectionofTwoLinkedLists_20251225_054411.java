// Last updated: 12/25/2025, 5:44:11 AM
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3        if (headA == null || headB == null) return null;
4
5        ListNode pA = headA;
6        ListNode pB = headB;
7
8        while (pA != pB) {
9            pA = (pA == null) ? headB : pA.next;
10            pB = (pB == null) ? headA : pB.next;
11        }
12
13        return pA; 
14    }
15}
16