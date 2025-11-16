// Last updated: 11/17/2025, 12:25:41 AM
// optimal
class Solution {

    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length-1;

        while( left < right ){

            while( left<right && !Character.isLetterOrDigit(ch[left]) ) left++;
            while( left<right && !Character.isLetterOrDigit(ch[right]) ) right--;

            if( Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) ) return false;

            left++;
            right--;
        }

        return true;
    }
}