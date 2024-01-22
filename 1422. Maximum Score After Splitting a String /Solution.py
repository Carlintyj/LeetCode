class Solution(object):
    def maxScore(self, s):
        """
        :type s: str
        :rtype: int
        """
        highest = zeroes = 0
        ones = s.count('1')

        for i in range(len(s) - 1):
            zeroes += s[i] == '0'
            ones -= s[i] == '1'
            highest = max(highest, zeroes + ones)
        
        return highest
        
