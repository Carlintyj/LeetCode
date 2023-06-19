int largestAltitude(int* gain, int gainSize){
    int largest = 0;
    int sum = 0;
    for (int i = 0; i < gainSize; i++) {
        sum += gain[i];
        largest = sum > largest ? sum : largest;
    }
    return largest;
}