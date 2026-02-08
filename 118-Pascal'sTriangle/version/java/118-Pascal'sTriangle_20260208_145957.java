// Last updated: 2/8/2026, 2:59:57 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        for( int i = 0; i<numRows; i++ ){
6
7            List<Integer> row = new ArrayList<>();
8
9            for( int j = 0; j<=i; j++ ){
10
11                if( j == 0 || j == i ){
12                    row.add(1);
13                }
14                else{
15                    row.add( result.get(i-1).get(j-1) + result.get(i-1).get(j) );
16                }
17            }
18
19            result.add(row);
20        }
21
22        return result;
23    }
24}