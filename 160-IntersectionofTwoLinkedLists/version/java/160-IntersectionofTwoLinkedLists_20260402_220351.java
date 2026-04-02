// Last updated: 4/2/2026, 10:03:51 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        
15        ListNode a = headA;
16        ListNode b = headB;
17
18        while( a != b ){
19            a = ( a == null )? headA : a.next;
20            b = ( b == null )? headB : b.next;
21        }
22
23        return a;
24
25    }
26}