import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> set = new HashSet<>();
        for (List<Integer> edge : edges) {
            set.add(edge.get(0));
        }
        for (List<Integer> edge : edges) {
            set.remove(edge.get(1));
        }
        return new ArrayList<>(set);
    }
}
