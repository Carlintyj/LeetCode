bool checkStraightLine(int** coordinates, int coordinatesSize, int* coordinatesColSize){
    if (coordinatesSize == 2) {
        return true;
    }
    for (int i = 1; i < coordinatesSize; i++) {
        int firstPoint = (coordinates[0][1] - coordinates[1][1]) *
                            (coordinates[0][0] - coordinates[i][0]);
        int secondPoint = (coordinates[0][1] - coordinates[i][1]) *
                            (coordinates[0][0] - coordinates[1][0]);
        if (firstPoint != secondPoint) {
            return false;
        }
    }
    return true;
}

