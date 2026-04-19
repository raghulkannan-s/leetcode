// Last updated: 4/19/2026, 8:54:57 PM
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        int n = nums.length;
4
5        long sum = 0;
6
7        int[] nse = new int[n];
8        int[] nge = new int[n];
9        int[] pse = new int[n];
10        int[] pge = new int[n];
11
12        Stack<Integer> sst = new Stack<>();
13        Stack<Integer> gst = new Stack<>();
14
15        for( int i = 0; i < n; i++ ){
16
17            while( !sst.isEmpty() && nums[sst.peek()] > nums[i] ){
18                sst.pop();
19            }
20            pse[i] = ( sst.isEmpty() ) ?-1: sst.peek();
21            sst.push(i);
22
23            while( !gst.isEmpty() && nums[gst.peek()] <= nums[i] ){
24                gst.pop();
25            }
26            pge[i] = ( gst.isEmpty() ) ?-1: gst.peek();
27            gst.push(i);
28
29        }
30        
31        sst.clear();
32        gst.clear();
33
34        for( int i = n-1; i >= 0; i-- ){
35
36            while( !sst.isEmpty() && nums[sst.peek()] >= nums[i] ){
37                sst.pop();
38            }
39            nse[i] = ( sst.isEmpty() ) ? n : sst.peek();
40            sst.push(i);
41
42            while( !gst.isEmpty() && nums[gst.peek()] < nums[i] ){
43                gst.pop();
44            }
45            nge[i] = ( gst.isEmpty() ) ? n : gst.peek();
46            gst.push(i);
47
48            sum += (long) ( nge[i] - i ) * ( i - pge[i] ) * nums[i] ; 
49            sum -= (long) ( nse[i] - i ) * ( i - pse[i] ) * nums[i] ; 
50        }
51
52        return sum;
53    
54
55    }
56}