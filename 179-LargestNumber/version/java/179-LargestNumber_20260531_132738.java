// Last updated: 5/31/2026, 1:27:38 PM
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
12        if(list.get(0).equals("0")) return "0";
13
14        StringBuilder sb = new StringBuilder();
15
16        for( String st : list ){
17            sb.append( st );
18        }
19
20        return sb.toString();
21    }
22}