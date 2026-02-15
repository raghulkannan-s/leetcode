// Last updated: 2/15/2026, 2:05:26 PM
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
12    public boolean isPalindrome(ListNode head) {
13        
14       
15        ListNode slow = head;
16        ListNode fast = head;
17
18
19        while( fast != null && fast.next!= null ){
20
21            slow = slow.next;
22            fast = fast.next.next;
23
24        }
25
26
27        ListNode prev = null;
28        ListNode curr = slow;
29
30        while( curr != null ){
31
32            ListNode temp = curr.next;
33            curr.next = prev;
34            prev = curr;
35            curr = temp;
36
37        }
38
39        ListNode left = head;
40        ListNode right = prev;
41
42        while( right != null ){
43
44            if( right.val != left.val ) return false;
45            right = right.next;
46            left = left.next;
47
48        }
49
50        return true;
51
52    }
53}