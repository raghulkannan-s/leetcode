// Last updated: 5/26/2026, 2:42:41 PM
1class Solution {
2    public int[] sortArray(int[] nums) {
3        mergeSort(nums, 0, nums.length-1);
4        return nums;
5    }
6
7    public void mergeSort( int[] arr, int left, int right ){
8
9        if ( left >= right ) return;
10
11        int mid = left + (right - left)/2;
12
13        mergeSort( arr, left, mid);
14        mergeSort( arr, mid+1, right);
15
16        merge( arr, left, mid, right );
17
18    }
19
20    public void merge( int[] arr, int low, int mid, int high ){
21
22        List<Integer> temp = new ArrayList<>();
23
24        int left = low;
25        int right = mid+1;
26
27        while( left <= mid && right <= high ){
28            if( arr[left] < arr[right] ){
29                temp.add( arr[left] );
30                left++;
31            } 
32            else{
33                temp.add( arr[right] );
34                right++;
35            }
36        }
37        while( left <= mid ){
38            temp.add( arr[left] );
39            left++;
40        }
41        while( right <= high ){
42            temp.add( arr[right] );
43            right++;
44        }
45
46        for( int i = low; i <= high; i++ ){
47            arr[i] = temp.get(i-low);
48        }
49
50    }
51
52}