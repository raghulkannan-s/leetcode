// Last updated: 4/26/2026, 9:20:18 AM
1class Solution {
2    public String sortVowels(String s) {
3        int n = s.length();
4
5        Map<Character, Integer> freq = new HashMap<>();
6        List<Integer> pos = new ArrayList<>();
7        List<Character> order = new ArrayList<>();
8
9        for( int i = 0 ; i <n; i++ ){
10            char c = s.charAt(i);
11            if( isVow(c) ){
12                pos.add(i);
13                if( !freq.containsKey(c) ){
14                    order.add(c);
15                    freq.put( c, 1 );
16                }
17                else{
18                    freq.put( c, freq.get(c)+1 );
19                }
20            }
21        }
22        List<Character> sorted = new ArrayList<>();
23
24        while( !order.isEmpty() ){
25            char best = order.get(0);
26
27            for( char c : order ){
28                if( freq.get(c) > freq.get(best) ){
29                    best = c;
30                }
31            }
32            int count = freq.get(best);
33            while( count-- > 0 ){
34                sorted.add(best);
35            }
36            order.remove( (Character) best );
37        }
38
39        char[] arr = s.toCharArray();
40        int p = 0;
41
42        for( int i : pos ){
43            arr[i] = sorted.get(p++);
44        }
45
46        return new String(arr);
47        
48    }
49
50    public boolean isVow(char c){
51        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
52            return true;
53        }
54        return false;
55    }
56}