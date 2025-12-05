// Last updated: 12/5/2025, 9:30:48 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] arr, int n) {
3        int count = n;
4        int N = arr.length;
5
6        if ( n == 0 ) return true;
7
8        for ( int i = 0; i<N; i++ ){
9                        
10            if( arr[i] == 0 ){
11                boolean left = ( i == 0 ) || (arr[i-1] == 0) ;
12                boolean right = ( i == N-1 ) || (arr[i+1] == 0) ;
13                if ( left && right ){
14                    arr[i] = 1;
15                    count--;
16                }
17                    if( count == 0 ) return true;
18            }
19        }
20        return false;
21    }
22}