// Last updated: 2/19/2026, 10:50:23 AM
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int i; 
//         int maxsum = nums[0];
//         int currentsum = nums[0];
    
//         for(i = 1; i < nums.length ; i++){
//             currentsum = Math.max(nums[i] , currentsum + nums[i]);
//             maxsum = Math.max(maxsum , currentsum);


//         } return maxsum ; 

//     }
// }

               // B R U T E    F O R C E//


// class Solution {
//     public int maxSubArray(int[] nums){
//         int maxSum = nums[0];
//         for (int st = 0; st < nums.length; st++){
//             int currentSum = 0;
//             for (int end = st; end < nums.length; end++){
//                 currentSum += nums[end];
//                 maxSum = Math.max(currentSum , maxSum);
//             }
//         } 
//         return maxSum;
//     }
// }


class Solution {
    public static int maxSubArray(int[] nums){
        int currentSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(currentSum , maxSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;

    }
}