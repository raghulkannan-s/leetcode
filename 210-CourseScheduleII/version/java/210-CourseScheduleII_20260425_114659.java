// Last updated: 4/25/2026, 11:46:59 AM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        
4        int n = prerequisites.length;
5
6        int[] res = new int[numCourses];
7        List<List<Integer>> adj = new ArrayList<>();
8        Queue<Integer> q = new LinkedList<>();
9        int[] indi = new int[numCourses];
10        int count = 0;
11
12        for( int i = 0; i < numCourses; i++ ){
13            adj.add(new ArrayList<>());
14        }
15
16        for( int i = 0; i < n; i++ ){
17            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
18            indi[prerequisites[i][0]]++;
19        }
20        for( int i = 0; i < numCourses; i++ ){
21            if( indi[i] == 0 ) q.add(i);
22        }
23
24        while( !q.isEmpty() ){
25
26            int node = q.poll();
27            res[count++] = node; 
28
29            for( int nei : adj.get(node) ){
30                indi[nei]--;
31                if( indi[nei] == 0 ){
32                    q.add(nei);
33                }
34            }
35        }
36
37        if( count < numCourses ) return new int[]{};
38        return res;
39    }
40}
41
42        