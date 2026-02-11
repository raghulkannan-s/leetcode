// Last updated: 2/11/2026, 11:22:16 PM
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
13    public ListNode detectCycle(ListNode head) {
14        
15        if( head == null || head.next == null ){
16            return null;
17        }
18
19        ListNode fast = head;
20        ListNode slow = head;
21
22        while( fast!=null && fast.next != null ){
23
24            slow = slow.next;
25            fast = fast.next.next;
26
27
28            if( slow == fast ){
29
30                ListNode ptr = head;
31
32                while( slow != ptr ){
33                    ptr = ptr.next;
34                    slow = slow.next;
35                }
36
37                return ptr;
38
39            }
40
41
42        }
43
44
45
46
47        return null;
48    }
49}