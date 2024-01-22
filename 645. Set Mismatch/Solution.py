class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        actualSum = sum(nums)
        n = len(nums)
        expected = n * (n+1)/2
        duplicate = set()
        duplicatedNum = 0
        for i in nums:
            if i in duplicate:
                duplicatedNum = i
            else:
                duplicate.add(i)
        return [duplicatedNum, expected - actualSum + duplicatedNum]
        
