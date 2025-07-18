# Last updated: 7/18/2025, 7:00:52 PM
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """

        INT_MIN = -2**31
        INT_MAX = 2**31 - 1
        
        result = 0
        if x > 0:
            sign = 1
            num = x
        elif x < 0:
            sign = -1
            num = abs(x)
        else:
            return 0

        while num > 0:
            digit = num % 10

            if result > INT_MAX // 10 or (result == INT_MAX // 10 and digit > INT_MAX % 10):
                return 0
                
            result = result * 10 + digit
            num = num // 10

        final_result = result * sign
        
        if not (INT_MIN <= final_result <= INT_MAX):
            return 0
            
        return final_result