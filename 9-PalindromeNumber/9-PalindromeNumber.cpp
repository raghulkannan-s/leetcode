// Last updated: 7/18/2025, 7:00:51 PM
class Solution {
public:
    
bool isPalindrome(int input) {
        int x = input;
        if(x<0) return false;
        int finalValue = 0;
        while(x!=0){
            int temp = x%10;
            x = x/10;
            if (finalValue > INT_MAX / 10 || (finalValue == INT_MAX / 10 && temp > 7)) return 0;
            if (finalValue < INT_MIN / 10 || (finalValue == INT_MIN / 10 && temp < -8)) return 0;
            finalValue = finalValue * 10 + temp;
        }
        if(input == finalValue){
            return true;
        }
        else{
            return false;
        }
    }
};
