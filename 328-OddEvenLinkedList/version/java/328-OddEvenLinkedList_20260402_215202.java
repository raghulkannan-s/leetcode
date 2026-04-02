// Last updated: 4/2/2026, 9:52:02 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode oddEvenList(ListNode head) {
13        
14        if( head == null || head.next == null) return head;
15
16        ListNode odd = head;
17        ListNode even = head.next;
18        ListNode evenHead = even;
19        
20        while( even != null && even.next != null){
21
22            odd.next = even.next;
23            odd = odd.next;
24
25            even.next = odd.next;
26            even = even.next;
27
28        }
29
30        odd.next = evenHead;
31
32        return head;
33    
34    
35    
36    }
37}