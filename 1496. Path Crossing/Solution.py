class Solution(object):
    def isPathCrossing(self, path):
        """
        :type path: str
        :rtype: bool
        """
        store = set()
        coord = (0, 0)
        store.add(coord)
        for direction in path:
            if direction == "N":
                coord = (coord[0], coord[1] + 1)
            elif direction == "S":
                coord = (coord[0], coord[1] - 1)
            elif direction == "E":
                coord = (coord[0] + 1, coord[1])
            elif direction == "W":
                coord = (coord[0] - 1, coord[1])
            if coord in store:
                return True
            store.add(coord)
        return False
