// Last updated: 4/5/2026, 11:02:53 AM
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
12
13    public ListNode sortList(ListNode head) {
14        
15        if( head == null || head.next == null ) return head;
16
17        ListNode mid = getMiddle( head );
18        ListNode rightHead = mid.next;
19        mid.next = null;
20
21        ListNode left = sortList(head);
22        ListNode right = sortList(rightHead);
23
24        
25
26        return merge( left, right );
27
28    }
29
30
31    public ListNode getMiddle( ListNode head ){
32
33        ListNode slow = head;
34        ListNode fast = head.next;
35
36        while( fast != null && fast.next != null ){
37            slow = slow.next;
38            fast = fast.next.next;
39        }
40
41        return slow;
42    }
43
44
45    public ListNode merge( ListNode left, ListNode right ){
46
47        ListNode dummy = new ListNode(-1);
48        ListNode temp = dummy;
49
50        while( left != null && right != null ){
51
52            if( left.val <= right.val ){
53                temp.next = left;
54                left = left.next;
55            }
56            else{
57                temp.next = right;
58                right = right.next;
59            }
60
61            temp = temp.next;
62
63        }
64
65        if( left != null ) temp.next = left;
66        else temp.next = right;
67
68        return dummy.next;
69
70    }
71
72}