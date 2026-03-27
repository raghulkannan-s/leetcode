// Last updated: 3/27/2026, 5:28:13 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3    long tsum1=0,tsum2=0,target=0,rsum=0;
4    int m=grid.length,n=grid[0].length;
5    int i=0,j=0;
6    for(i=0;i<m;i++){
7        for(j=0;j<n;j++){
8            tsum1+=grid[i][j];
9        }
10    }
11    tsum2 = tsum1;
12    target = tsum1/2;
13    if(tsum1%2==1) return false;
14    for(i=0;i<m;i++){
15        rsum=0;
16        for(j=0;j<n;j++){
17            rsum+=grid[i][j];
18        }
19        tsum1-=rsum;
20        if(target==tsum1)
21            return true;
22        }
23        for(i=0;i<n;i++){
24        rsum=0;
25        for(j=0;j<m;j++){
26            rsum+=grid[j][i];
27        }
28        tsum2-=rsum;
29        if(target==tsum2)
30        return true;
31    }
32    return false;
33    }
34}