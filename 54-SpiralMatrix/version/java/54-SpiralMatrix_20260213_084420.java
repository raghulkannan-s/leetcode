// Last updated: 2/13/2026, 8:44:20 AM
1class Solution {
2
3    public List<Integer> spiralOrder(int[][] arr) {
4        
5        int row = 0;
6        int col = 0;
7
8        int er = arr.length;
9        int ec = arr[0].length;
10
11        List<Integer> res = new ArrayList<>();
12
13        while( row < er && col < ec  ){
14
15
16            for( int i = col; i < ec; i++ ){
17                res.add(arr[row][i]);
18            }
19            row++;
20
21            for( int i = row; i < er; i++ ){
22                res.add(arr[i][ec-1]);
23            }
24            ec--;
25            
26            if (row < er) {
27
28                for( int i = ec-1; i >= col; i-- ){
29                    res.add(arr[er-1][i]);
30                }
31                er--;
32            }
33
34            if (col < ec) {
35                for (int i = er - 1; i >= row; i--) {
36                    res.add(arr[i][col]);
37                }
38                col++;
39            }
40        }
41
42
43        return res;
44
45    }
46}