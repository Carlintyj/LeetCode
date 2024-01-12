class Solution(object):
    def halvesAreAlike(self, s):
        """
        :type s: str
        :rtype: bool
        """
        vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
        n = len(s)

        firstHalf = 0
        secondHalf = 0
        for i in s[:n/2]:
            if i in vowels:
                firstHalf += 1
        
        for i in s[n/2:n]:
            if i in vowels:
                secondHalf += 1
        return firstHalf == secondHalf
