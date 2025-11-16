// Last updated: 11/17/2025, 12:23:53 AM
class Solution {

    private boolean isNotAlphanumeric(char c) {
    return !Character.isLetterOrDigit(c);
    }

    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length-1;

        while( left < right ){

            while( left<right && isNotAlphanumeric(ch[left]) ) left++;
            while( left<right && isNotAlphanumeric(ch[right]) ) right--;

            char a = Character.toLowerCase(ch[left]);
            char b = Character.toLowerCase(ch[right]);

            if( a != b ) return false;

            left++;
            right--;
        }

        return true;
    }
}