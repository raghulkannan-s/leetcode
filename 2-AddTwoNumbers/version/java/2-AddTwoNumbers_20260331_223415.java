// Last updated: 3/31/2026, 10:34:15 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        
14        int carry = 0;
15
16        ListNode curr = new ListNode();
17        ListNode head = curr;
18
19        while( l1 != null || l2 != null || carry != 0 ){
20
21            int n1 = ( l1 != null )? l1.val : 0;
22            int n2 = ( l2 != null )? l2.val : 0;
23
24            int sum = n1 + n2 + carry;
25            carry = sum/10;
26            sum = sum % 10;
27            ListNode temp = new ListNode(sum);
28
29            curr.next = temp;
30            curr = curr.next;
31
32            if( l1 != null ){
33                l1 = l1.next;
34            }
35            if( l2 != null ){
36                l2 = l2.next;
37            }
38        }
39
40        
41
42        return head.next;
43
44    }
45}