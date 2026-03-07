// Last updated: 3/7/2026, 7:06:27 PM
1class Solution {
2    public int minEatingSpeed(int[] arr, int h) {
3        
4        int l = 1;
5        int r = Arrays.stream(arr).max().getAsInt();
6        int ans = 0;
7
8        while( l <= r ){
9
10            int mid = l + (r-l)/2;
11            if( isPossible(mid, arr, h) ){
12                r = mid-1;
13                ans = mid;
14            }
15            else{
16                l = mid+1;
17            }
18        }
19        return ans;
20    }
21
22    public boolean isPossible( int speed, int[] piles, int h ){
23
24        int hours = 0;
25
26        for( int pile : piles ){
27            
28            hours += Math.ceil((double)pile/speed);
29
30        }
31
32        return hours <= h;
33    }
34
35}