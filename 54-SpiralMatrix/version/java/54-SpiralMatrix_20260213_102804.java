// Last updated: 2/13/2026, 10:28:04 AM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        
4        List<Integer> res = new ArrayList<>();
5
6        int can1 = 0, can2 = 0;
7        int c1 = 0, c2 = 0;
8
9
10
11        for(int num : nums) {
12
13            if(num == can1) {
14                c1++;
15            }
16            else if(num == can2) {
17                c2++;
18            }
19            else if(c1 == 0) {
20                can1 = num;
21                c1 = 1;
22            }
23            else if(c2 == 0) {
24                can2 = num;
25                c2 = 1;
26            }
27            else {
28                c1--;
29                c2--;
30            }
31
32        }
33
34        c1 = 0;
35        c2 = 0;
36
37        for (int num : nums) {
38            if (num == can1) c1++;
39            else if (num == can2) c2++;
40        }
41
42        if (c1 > nums.length / 3) res.add(can1);
43        if (c2 > nums.length / 3) res.add(can2);
44
45        return res;
46    }
47}