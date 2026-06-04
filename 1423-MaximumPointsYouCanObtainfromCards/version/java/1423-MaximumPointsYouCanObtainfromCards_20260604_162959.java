// Last updated: 6/4/2026, 4:29:59 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        
4        int n = cardPoints.length;
5
6        int left = k-1;
7        int right = n-1;
8
9        int sum = 0;
10
11        for( int i = 0; i < k; i++ ){
12            sum += cardPoints[i];
13        }
14
15        int max = sum;
16
17        while( left >= 0 ){
18
19            sum -= cardPoints[left--];
20            sum += cardPoints[right--];
21
22            max = Math.max( sum, max );
23
24        }
25
26        return max;
27
28    }
29}