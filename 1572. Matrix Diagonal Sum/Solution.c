int diagonalSum(int** mat, int matSize, int* matColSize){
    int result = 0;
    for (int i = 0; i < matSize; i++) {
        result += mat[i][i];
        result += i == matSize - 1 - i ? 0 : mat[i][matSize - 1 - i];
    } 
    return result;
}