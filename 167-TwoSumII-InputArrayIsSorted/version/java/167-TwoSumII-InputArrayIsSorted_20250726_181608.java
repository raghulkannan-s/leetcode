// Last updated: 7/26/2025, 6:16:08 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        

        int l = 0;
        int r = numbers.length -1;
        int t = target;


        while ( l<r ){

        int sum = numbers[l] + numbers[r];

            if( sum == t){
                return new int[] { l+1 , r+1 };
            }

            if( t < sum ){
                r--;
            }
            if( t > sum ){
                l++;
            }
        }
        return new int[] {-1, -1};

    }
}