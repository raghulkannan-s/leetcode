// Last updated: 5/4/2026, 12:56:10 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3
4        List<List<String>> res = new ArrayList<>();
5        backtrack( 0, s, new ArrayList<>(), res );
6        return res;
7
8    }
9
10    void backtrack( int start, String s, List<String> path, List<List<String>> res ){
11
12        if( start == s.length() ){
13            res.add(new ArrayList<>(path));
14            return;
15        }
16
17        for( int end = start; end < s.length(); end++ ){
18            
19            if( isPalindrome(start, end, s) ){
20                path.add( s.substring(start, end+1) );
21                backtrack( end+1, s, path, res );
22                path.remove(path.size()-1);
23            }
24        }
25    }
26
27
28    boolean isPalindrome(int left, int right, String s){
29
30        while( left <= right ){
31            if( s.charAt(left++) != s.charAt(right--)) return false;
32        }
33        return true;
34    }
35
36
37
38}