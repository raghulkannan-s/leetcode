// Last updated: 12/22/2025, 2:43:30 AM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        
14        ListNode dummy = new ListNode(-1);
15        ListNode tail = dummy;
16
17
18        while ( list1 != null && list2 != null ){
19
20            if ( list1.val <= list2.val ){
21
22                tail.next = list1;
23                list1 = list1.next;
24
25            } 
26            else {
27
28                tail.next = list2;
29                list2 = list2.next;
30
31            }
32
33            tail = tail.next;
34
35        }
36
37
38        if ( list1 != null ){
39            
40            tail.next = list1;
41
42        }
43        else{
44            tail.next = list2;
45        }
46
47        return dummy.next;
48
49    }
50}