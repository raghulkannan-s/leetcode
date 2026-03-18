// Last updated: 3/18/2026, 5:25:56 PM
1
2class Solution {
3    public int[][] merge(int[][] intervals) {
4        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
5
6        List<int[]> res = new ArrayList<>();
7
8        for (int[] interval : intervals) {
9            if (res.isEmpty() || res.get(res.size() - 1)[1] < interval[0]) {
10                res.add(interval);
11            } else {
12                res.get(res.size() - 1)[1] = Math.max(
13                    res.get(res.size() - 1)[1],
14                    interval[1]
15                );
16            }
17        }
18
19        return res.toArray(new int[res.size()][]);
20    }
21}