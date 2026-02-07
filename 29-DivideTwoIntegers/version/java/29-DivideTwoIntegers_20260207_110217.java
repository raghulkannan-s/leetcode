// Last updated: 2/7/2026, 11:02:17 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if(dividend==Integer.MIN_VALUE && divisor==-1){
4            return Integer.MAX_VALUE;
5        }
6        if(dividend==Integer.MAX_VALUE && divisor==-1){
7            return -Integer.MAX_VALUE;
8        }
9        if(divisor==1){
10            return dividend;
11        }
12  
13        int count = 0;
14
15        boolean neg = false;
16
17        if( divisor < 0 && dividend < 0){
18            neg = false;
19        }
20        else if( divisor < 0 || dividend < 0){
21            neg = true;
22        }
23        
24        long div = Math.abs((long)divisor);
25        long dnd = Math.abs((long)dividend);
26
27        while(div<=dnd){
28
29            dnd-=div;
30            count++;
31
32
33        }
34
35        if( neg ){
36            return -count;
37        }
38
39        return count;
40
41    }
42}