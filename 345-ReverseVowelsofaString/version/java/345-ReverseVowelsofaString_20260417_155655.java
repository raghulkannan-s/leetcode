// Last updated: 4/17/2026, 3:56:55 PM
1class Solution {
2    public String reverseVowels(String s) {
3        
4        char[] arr = s.toCharArray();
5        int left = 0, right = arr.length - 1;
6
7        while (left < right) {
8
9            if (!isVowel(arr[left])) {
10                left++;
11            } else if (!isVowel(arr[right])) {
12                right--;
13            } else {
14                char temp = arr[left];
15                arr[left] = arr[right];
16                arr[right] = temp;
17
18                left++;
19                right--;
20            }
21        }
22
23        return new String(arr);
24    }
25    private boolean isVowel(char c) {
26        c = Character.toLowerCase(c);
27        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
28    }
29}