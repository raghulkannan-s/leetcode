// Last updated: 11/20/2025, 10:33:16 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        int n = temp.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for ( int i = 0; i < n; i++ ){
            int curr = temp[i];

            while( !stack.isEmpty() && curr > temp[stack.peek()] ){
                int prev = stack.pop();
                result[prev] = i - prev;
            }

            stack.push(i);
        }

        return result;
    
    }
}