// Last updated: 4/7/2026, 8:50:12 AM
1class Solution {
2    public int[] dailyTemperatures(int[] temp) {
3        
4        int n = temp.length;
5        int[] result = new int[n];
6
7        Stack<Integer> stack = new Stack<>();
8
9        for ( int i = 0; i < n; i++ ){
10            int curr = temp[i];
11
12            while( !stack.isEmpty() && curr > temp[stack.peek()] ){
13                int prev = stack.pop();
14                result[prev] = i - prev;
15            }
16
17            stack.push(i);
18        }
19
20        return result;
21    
22    }
23}