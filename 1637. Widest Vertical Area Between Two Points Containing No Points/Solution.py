class Solution(object):
    def maxWidthOfVerticalArea(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        points = sorted(points)
        diff = points[1][0] - points[0][0]
        for i in range(2, len(points)):
            diff = max(diff, points[i][0] - points[i-1][0])
        return diff