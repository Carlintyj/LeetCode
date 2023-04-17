import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largest = -1;
        for (int candy : candies) {
            largest = Math.max(largest, candy);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= largest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}