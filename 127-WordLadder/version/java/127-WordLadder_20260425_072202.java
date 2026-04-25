// Last updated: 4/25/2026, 7:22:02 AM
1
2public class Pair {
3    String word;
4    int steps;
5    public Pair( String word, int steps ){
6        this.word = word;
7        this.steps = steps;
8    }
9}
10
11class Solution {
12    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
13        
14        Queue<Pair> q = new LinkedList<>();
15        HashSet<String> set = new HashSet<>(wordList);
16
17        q.add( new Pair(beginWord, 1) );
18        set.remove( beginWord );
19
20        while( !q.isEmpty() ){
21            
22            Pair node = q.poll();
23
24            if( endWord.equals(node.word) ) return node.steps;
25
26            String word = node.word;
27            int steps = node.steps;
28
29            for( int i = 0; i < word.length(); i++ ){
30                char[] arr = word.toCharArray();
31                for( char ch = 'a'; ch<='z'; ch++ ){
32                    arr[i] = ch;
33                    String check = new String(arr);
34                    if(set.contains(check)){
35                        set.remove(check);
36                        q.add(new Pair(check, steps+1));
37                    }
38                }
39            }
40      
41        }
42
43        return 0;
44
45
46    }
47}