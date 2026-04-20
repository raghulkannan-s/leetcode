// Last updated: 4/20/2026, 9:42:48 AM
1
2class Solution {
3    public int findRadius(int[] houses, int[] heaters) {
4
5        Arrays.sort(houses);
6        Arrays.sort(heaters);
7
8        int left = 0;
9        int right = (int)1e9;
10        int ans = 0;
11
12        while (left <= right) {
13            int mid = left + (right - left) / 2;
14
15            if (isPossible(mid, houses, heaters)) {
16                ans = mid;
17                right = mid - 1;
18            } else {
19                left = mid + 1;
20            }
21        }
22
23        return ans;
24    }
25
26    private boolean isPossible(int radius, int[] houses, int[] heaters) {
27
28        for (int house : houses) {
29
30            int idx = Arrays.binarySearch(heaters, house);
31
32            if (idx >= 0) continue; 
33
34            idx = -idx - 1; 
35            int leftDist = Integer.MAX_VALUE;
36            int rightDist = Integer.MAX_VALUE;
37
38            if (idx - 1 >= 0) {
39                leftDist = house - heaters[idx - 1];
40            }
41
42            if (idx < heaters.length) {
43                rightDist = heaters[idx] - house;
44            }
45
46            int minDist = Math.min(leftDist, rightDist);
47
48            if (minDist > radius) return false;
49        }
50
51        return true;
52    }
53}