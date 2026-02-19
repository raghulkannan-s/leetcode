// Last updated: 2/19/2026, 10:33:28 AM
1class Solution {
2
3    public List<Integer> spiralOrder(int[][] arr) {
4
5        List<Integer> res = new ArrayList<>();
6
7        int[] dr = { 0, 1, 0, -1 };
8        int[] dc = { 1, 0, -1, 0 };
9
10        int m = arr.length;
11        int n = arr[0].length;
12
13        int tot = m*n;
14        int curr = 0;
15
16        int i = 0;
17        int j = 0;
18
19        int dir = 0;
20
21        while( curr < tot ){
22
23            res.add( arr[i][j] );
24            curr++;
25            arr[i][j] = Integer.MIN_VALUE;
26
27            i += dr[dir];
28            j += dc[dir];
29
30            if( i<0 || i >= m 
31            || j < 0 || j>=n || 
32            arr[i][j] == Integer.MIN_VALUE ){
33
34                i -= dr[dir];
35                j -= dc[dir];
36
37                dir = (dir + 1) % 4;
38                
39                i += dr[dir];
40                j += dc[dir];
41
42            }
43
44        }
45
46        return res;
47
48    }
49}