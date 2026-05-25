// Last updated: 5/25/2026, 11:42:10 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        
4        if( s.length() != goal.length() ) return false;
5
6        String res = s + s;
7        return res.contains(goal);
8
9    }
10}