// Last updated: 11/19/2025, 4:42:41 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
       
        int n = nums.length;
        int[] newArr = new int[n*2];

       for (int j = 0; j < n; j++) {
                newArr[j] = nums[j];
                newArr[j+n] = nums[j];
        }

        return newArr;
    }
    
}