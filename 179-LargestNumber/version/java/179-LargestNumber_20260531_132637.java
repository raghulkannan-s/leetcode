// Last updated: 5/31/2026, 1:26:37 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3
4        List<String> list = new ArrayList<>();
5        
6        for( int n : nums ){
7            list.add( String.valueOf(n) );
8        }
9
10        Collections.sort( list, (a,b) -> (b+a).compareTo(a+b) );
11
12        StringBuilder sb = new StringBuilder();
13
14        for( String st : list ){
15            sb.append( st );
16        }
17
18        String res = sb.toString();
19
20        return res.startsWith("0")? "0" : res;
21
22    }
23}