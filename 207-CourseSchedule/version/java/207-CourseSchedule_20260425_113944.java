// Last updated: 4/25/2026, 11:39:44 AM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        
4        int n = prerequisites.length;
5
6        List<List<Integer>> adj = new ArrayList<>();
7        Queue<Integer> q = new LinkedList<>();
8        int[] indi = new int[numCourses];
9        int count = 0;
10
11        for( int i = 0; i < numCourses; i++ ){
12            adj.add(new ArrayList<>());
13        }
14
15        for( int i = 0; i < n; i++ ){
16            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
17            indi[prerequisites[i][1]]++;
18        }
19        for( int i = 0; i < numCourses; i++ ){
20            if( indi[i] == 0 ) q.add(i);
21        }
22
23        while( !q.isEmpty() ){
24
25            int node = q.poll();
26            count++;
27
28            for( int nei : adj.get(node) ){
29                indi[nei]--;
30                if( indi[nei] == 0 ){
31                    q.add(nei);
32                }
33            }
34
35        }
36        return count >= numCourses;
37    }
38}