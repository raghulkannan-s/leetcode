// Last updated: 11/17/2025, 9:23:59 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
       
        int n = nums.length;
        int[] newArr = new int[n*2];

       for (int j = 0; j < n; j++) {
                newArr[j] = nums[j];
        }
        
        for (int j = 0; j < n; j++) {
            newArr[j+n] = nums[j];
        }

        return newArr;
    }


    
}