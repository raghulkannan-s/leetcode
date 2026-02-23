// Last updated: 2/23/2026, 12:59:02 PM
1class Solution {
2    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
3        
4        int sum = 0;
5
6        for( int i = 0; i < nums.size(); i++ ){
7            if( setBits(i) == k ){
8                sum += nums.get(i);
9            }
10        }
11        return sum;
12    }
13
14
15    public int setBits(int n){
16        int count = 0;
17        while ( n > 0 ){
18            count+=n&1;
19            n>>=1;
20        }
21        return count;
22    }
23
24
25
26
27}