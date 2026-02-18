// Last updated: 2/18/2026, 6:48:02 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        String t=Integer.toBinaryString(n);
        for(int i=1;i<t.length();i++)
        {
            if(t.charAt(i)==t.charAt(i-1))
            {
                return false;
            }
        }return true;
    }
}