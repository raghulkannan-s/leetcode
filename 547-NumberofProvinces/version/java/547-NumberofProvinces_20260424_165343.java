// Last updated: 4/24/2026, 4:53:43 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        
4        int ans = 0;
5        int n = isConnected.length;
6        boolean[] visited = new boolean[n];
7
8        for( int i = 0; i < n; i++ ){
9            if( !visited[i] ){
10                dfs( i, visited, isConnected );
11                ans++;
12            }
13        }
14
15        return ans;
16    }
17    public void dfs( int i, boolean[] visited, int[][] adj ){
18        
19        visited[i] = true;
20
21        for( int j = 0; j < adj[i].length; j++ ){
22            if( !visited[j] && adj[i][j] == 1 ){
23                visited[j] = true;
24                dfs(j, visited, adj);
25            }
26        }
27    }
28}
29
30
31