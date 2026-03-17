// Last updated: 3/17/2026, 12:53:44 PM
1
2class Solution {
3    public int bagOfTokensScore(int[] tokens, int power) {
4        
5        Arrays.sort(tokens);
6
7        int left = 0, right = tokens.length - 1;
8        int score = 0, maxScore = 0;
9
10        while (left <= right) {
11
12            if (power >= tokens[left]) {
13                power -= tokens[left];
14                score++;
15                left++;
16                maxScore = Math.max(maxScore, score);
17
18            } else if (score > 0) {
19                power += tokens[right];
20                score--;
21                right--;
22
23            } else {
24                break;
25            }
26        }
27
28        return maxScore;
29    }
30}