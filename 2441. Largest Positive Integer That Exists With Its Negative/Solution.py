class Solution(object):
    def findMaxK(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        hashTable = set()
        validHashTable = set()
        for element in nums:
            hashTable.add(element)
        
        for element in hashTable:
            if -element in hashTable:
                validHashTable.add(element)
        return max(validHashTable) if len(validHashTable) != 0 else -1
