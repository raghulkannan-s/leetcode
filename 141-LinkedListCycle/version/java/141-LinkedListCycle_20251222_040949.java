// Last updated: 12/22/2025, 4:09:49 AM
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
14        if ( head == null || head.next == null ) return true;
15
16        ListNode fast = head;
17        ListNode slow = head;
18
19        while ( fast != null && fast.next != null){
20            slow = slow.next;
21            fast = fast.next.next;
22        }
23
24        ListNode prev = null;
25        ListNode curr = slow;
26
27        while ( curr != null ){
28            ListNode nextNode = curr.next;
29            curr.next = prev;
30            prev = curr;
31            curr = nextNode;
32        }
33
34        ListNode left = head;
35        ListNode right = prev;
36
37        while ( right != null ){
38            if ( right.val != left.val ) return false;
39            right = right.next;
40            left = left.next;
41        }
42
43        return true;
44
45    }
46}