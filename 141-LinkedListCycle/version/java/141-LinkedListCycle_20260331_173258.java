// Last updated: 3/31/2026, 5:32:58 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        
15        ListNode fast = head;
16        ListNode slow = head;
17
18        while( fast != null && fast.next != null ){
19
20            fast = fast.next.next;
21            slow = slow.next;
22            
23            if( fast == slow ){
24                return true;
25            }
26
27        }
28
29
30        return false;
31
32    }
33}