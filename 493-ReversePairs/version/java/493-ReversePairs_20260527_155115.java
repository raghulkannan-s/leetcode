// Last updated: 5/27/2026, 3:51:15 PM
1class Solution {
2
3    int count = 0;
4
5    public int reversePairs(int[] nums) {
6        
7        mergeSort( nums, 0, nums.length-1 );
8        return count;
9
10    }
11
12    public void mergeSort( int[] nums, int left, int right ){
13
14        if( left >= right ) return;
15
16        int mid = left + ( right - left )/2;
17
18        mergeSort( nums, left, mid );
19        mergeSort( nums, mid+1, right );
20
21        countPairs(nums, mid, left, right);
22
23        merge( nums, mid, left, right );
24
25    }
26
27    public void countPairs( int[] nums, int mid, int low, int high ){
28
29        int right = mid+1;
30
31        for( int i = low; i <= mid; i++ ){
32            
33            while( right <= high && ( nums[i] > 2L * nums[right] ) ){
34                right++;
35            }
36
37            count += right-mid-1;
38        }
39
40    }
41
42    public void merge( int[] arr, int mid, int low, int high ){
43
44        List<Integer> temp = new ArrayList<>();
45
46        int left = low;
47        int right = mid+1;
48
49        while( left <= mid && right <= high ){
50            if( arr[left]<arr[right] ){
51                temp.add(arr[left]);
52                left++;
53            }
54            else{
55                temp.add(arr[right]);
56                right++;
57            }
58        }
59
60        while( left <= mid ){
61            temp.add(arr[left]);
62            left++;
63        } 
64
65        while( right <= high ){
66            temp.add(arr[right]);
67            right++;
68        } 
69
70        for( int i = low; i <= high; i++ ){
71            arr[i] = temp.get( i-low );
72        }
73
74    }
75
76
77}