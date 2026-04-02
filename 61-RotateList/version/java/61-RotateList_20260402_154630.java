// Last updated: 4/2/2026, 3:46:30 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        
14        if( k == 0 ) return head;
15        if( head == null ) return null;
16
17        int len = 0;
18        ListNode lenCheck = head;
19        while( lenCheck != null ){ lenCheck = lenCheck.next; len++; }
20        
21        k = k%len;
22        if ( k == len || len == 1 ) return head;
23         if( k == 0 ) return head;
24        System.out.println(k);
25
26        ListNode dummy = new ListNode(-1, head);
27
28        ListNode slow = head;
29        ListNode fast = head;
30
31        for( int i = 0; i < k; i++ ) fast = fast.next;
32        
33
34        while( fast != null && fast.next != null ){
35            slow = slow.next;
36            fast = fast.next;
37        }
38
39        dummy.next = slow.next;
40        fast.next = head;
41        slow.next = null;
42
43
44        return dummy.next;
45    }
46}