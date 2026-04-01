// Last updated: 4/1/2026, 10:14:32 PM
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
11
12
13class Solution {
14    public ListNode reverseKGroup(ListNode head, int k) {
15        
16        if( k == 1 || head == null ) return head;
17
18        ListNode dummy = new ListNode(-1, head);
19        ListNode prevGroupEnd = dummy;
20
21        while( true ){
22
23            ListNode kth = prevGroupEnd.next;
24            
25            for( int i = 0; i < k-1 && kth != null ; i++ ){
26                kth = kth.next;
27            }
28
29            if( kth == null ) break;
30
31            ListNode nextGroupStart = kth.next;
32            ListNode prev = nextGroupStart;
33            ListNode curr = prevGroupEnd.next;
34
35            while( curr != nextGroupStart ){
36                ListNode next = curr.next;
37                curr.next = prev;
38                prev = curr;
39                curr = next;
40            }
41
42            ListNode currGroupStart = prev;
43            ListNode currGroupEnd = prevGroupEnd.next;
44
45            prevGroupEnd.next = currGroupStart;
46            prevGroupEnd = currGroupEnd;
47
48        }
49
50        return dummy.next;
51
52
53    }
54}