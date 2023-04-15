import math
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        new_array = nums1 + nums2
        new_array = sorted(new_array)
        if len(new_array) % 2 == 0:
            middle = len(new_array)/2
            middle = int(middle)
            return (new_array[middle-1] + new_array[middle])/ 2
        else:
            middle = len(new_array)//2
            return new_array[middle]