// Last updated: 3/17/2026, 11:36:26 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        
4        HashSet<Integer> set = new HashSet<>();
5
6        for(int num : nums){
7            set.add(num);
8        }
9
10        int longest = 0;
11
12        for( int num : set ){
13           if( !set.contains(num-1) ){
14
15                int curr = num;
16                int length = 1;
17
18                while( set.contains(curr+1) ){
19                    length++;
20                    curr++;
21                }
22
23                longest = Math.max( longest, length );
24
25           }
26        }
27
28        return longest;
29    }
30}