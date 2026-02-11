// Last updated: 2/11/2026, 6:07:53 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13
14
15        if( head == null ) return null;
16        ListNode curr =  head;
17
18
19        while( curr != null && curr.next != null ){
20
21            if( curr.val == curr.next.val ){
22                curr.next = curr.next.next;
23            } else{
24                curr = curr.next;
25            }
26
27
28        }
29
30
31
32    return head;
33
34
35
36
37    }
38}