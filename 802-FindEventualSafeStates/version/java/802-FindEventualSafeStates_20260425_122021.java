// Last updated: 4/25/2026, 12:20:21 PM
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3
4        int v = graph.length;
5        List<Integer> res = new ArrayList<>();
6        int[] oudi = new int[v];
7
8        Queue<Integer> q = new LinkedList<>();
9        List<List<Integer>> adj = new ArrayList<>();
10
11        for( int i = 0; i < v; i++ ){
12            adj.add(new ArrayList<>());
13        }
14
15        for( int i = 0; i < v; i++ ){
16            oudi[i] = graph[i].length;
17            for( int j = 0; j < oudi[i]; j++ ){
18                adj.get(graph[i][j]).add(i);
19            }
20        }
21
22        for( int i = 0; i < v; i++ ){
23            if( oudi[i] == 0 ){
24                q.add(i);
25            }
26        }
27
28        while( !q.isEmpty() ){
29
30            int node = q.poll();
31            oudi[node]--;
32            res.add(node);
33
34            for( int nei : adj.get(node) ){
35                oudi[nei]--;
36                if(oudi[nei]==0){
37                    q.add(nei);
38                }
39            }
40        }
41
42        Collections.sort(res);
43        return res;
44    }
45}
46
47