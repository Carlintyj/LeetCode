class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0: 
            return False
        else:
            s = str(x)
            reverse = s[::-1]
            for i in range(len(reverse)):
                if reverse[i] != s[i]:
                    return False

        return True
