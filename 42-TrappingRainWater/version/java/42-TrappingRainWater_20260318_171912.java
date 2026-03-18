// Last updated: 3/18/2026, 5:19:12 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        
4        int totalCost = 0;
5        int totalGas = 0;
6
7        int currentTank = 0;
8        int start = 0;
9
10
11
12        for( int i = 0; i < gas.length; i++ ){
13
14            totalGas += gas[i];
15            totalCost += cost[i];
16
17            currentTank += gas[i] - cost[i];
18
19
20            if( currentTank < 0 ){
21                start = i+1;
22                currentTank = 0;
23            }
24
25
26        }
27
28
29
30
31        if( totalCost <= totalGas ){
32            return start;
33        }
34
35        return -1;
36    }
37}