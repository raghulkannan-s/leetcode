// Last updated: 11/17/2025, 11:52:53 PM
class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();
        int n =  arr.length;

        int left = 0, right = n-1;
        
        while( left < right ){
            while( left < right && !Character.isLetter(arr[left]) ){
                left++;
            }
            while( left < right && !Character.isLetter(arr[right]) ){
                right--;
            }

            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++; right--;
        }

        return new String(arr);
    }
}