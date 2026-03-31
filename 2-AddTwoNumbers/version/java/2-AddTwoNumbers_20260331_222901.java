// Last updated: 3/31/2026, 10:29:01 PM
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
19        while( l1 != null && l2 != null ){
20            int sum = l1.val + l2.val + carry;
21            carry = sum/10;
22            sum = sum % 10;
23            ListNode temp = new ListNode(sum);
24            curr.next = temp;
25            curr = curr.next;
26            l1 = l1.next;
27            l2 = l2.next;
28        }
29
30        while( l1 != null ){
31            int sum = l1.val + carry;
32            carry = sum/10;
33            ListNode temp = new ListNode(sum%10);
34            curr.next = temp;
35            curr = curr.next;
36            l1 = l1.next;
37        }
38
39        while( l2 != null ){
40            int sum = l2.val + carry;
41            carry = sum/10;
42            ListNode temp = new ListNode(sum%10);
43            curr.next = temp;
44            curr = curr.next;
45            l2 = l2.next;
46        }
47
48        if( carry != 0 ){
49            curr.next = new ListNode(carry);
50        }
51
52        return head.next;
53
54    }
55}