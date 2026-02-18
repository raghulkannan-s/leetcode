// Last updated: 2/18/2026, 6:42:19 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        String s="";
        while(n!=0){
        if(n%2==0) s+='0';
        else s+='1';    
        n/=2;
        }
        char arr[]=s.toCharArray();
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) return false;
        }
        return true;
    }
}