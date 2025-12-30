// Last updated: 12/30/2025, 2:05:26 PM
1class Solution {
2
3    int findMin( int a, int b ){
4        if ( a < b ) return a;
5        return b;
6    }
7
8    void rev( char[] arr, int left, int right ){
9        while( left < right ){
10            char temp = arr[left];
11            arr[left] = arr[right];
12            arr[right] = temp;
13            left++;
14            right--;
15        }
16    }
17
18    public String reverseStr(String s, int k) {
19       char[] arr = s.toCharArray();
20       int n = arr.length;
21
22       for ( int i = 0; i < n; i += 2*k ){
23            int left = i;
24            int right = findMin( i+k-1, n-1 );
25            rev( arr, left, right );
26       }
27
28       return new String(arr);
29
30    }
31}
32