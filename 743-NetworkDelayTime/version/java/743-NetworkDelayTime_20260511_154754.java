// Last updated: 5/11/2026, 3:47:54 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        
4        List<List<int[]>> adjList = new ArrayList<>();
5
6        for( int i = 0; i <= n; i++ ){
7            adjList.add( new ArrayList<>());
8        }
9
10        for( int[] time : times ){
11
12            int u = time[0];
13            int v = time[1];
14            int w = time[2];
15
16            adjList.get(u).add(new int[]{ v, w });
17        }
18
19        int[] dist = new int[n+1];
20        Arrays.fill(dist, Integer.MAX_VALUE);
21
22        dist[k] = 0;
23        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> a[1] - b[1] );
24        pq.offer( new int[]{ k, 0 } );
25
26        while( !pq.isEmpty() ){
27
28            int[] curr = pq.poll();
29
30            int node = curr[0];
31            int currDist = curr[1];
32
33            if( currDist > dist[node] ) continue;
34
35            for( int[] nei : adjList.get(node) ){
36
37                int nextNode = nei[0];
38                int weight = nei[1];
39
40                int currWeight = currDist + weight;
41
42                if( currWeight < dist[nextNode] ){
43                    dist[nextNode] = currWeight;
44                    pq.offer( new int[]{ nextNode, currWeight } );
45                }
46            }
47        }
48            int max = 0;
49
50            for( int i = 1; i <= n; i++ ){
51                if( dist[i] == Integer.MAX_VALUE ) return -1;
52                max = Math.max( max, dist[i] );
53            }
54
55            return max;
56
57    }
58}