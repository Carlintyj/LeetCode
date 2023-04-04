import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int partitionString(String s) {
        Map<Character, Integer> last_index = new HashMap<>();
        List<Integer> substr_start = new ArrayList<>();
        int start_index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last_index.containsKey(c) && last_index.get(c) >= start_index) {
                substr_start.add(start_index);
                start_index = i;
            }
            last_index.put(c, i);
        }
        substr_start.add(start_index);
        return substr_start.size();
    }
}