import java.lang.Math;

class Solution {
    public int[] constructRectangle(int area) {
        int square = (int) Math.sqrt(area);
        int W = 1;

        for(int i = square; i > 0; i--) {
            if (area%i == 0 ) {
                W = i;
                break;
            }
        }
        return new int[]{area/W, W};
    }
}