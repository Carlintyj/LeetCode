import java.util.*;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n]; // Array to store the color of each node
        
        for (int i = 0; i < n; i++) {
            if (colors[i] == 0 && !dfs(graph, colors, i, 1)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(int[][] graph, int[] colors, int node, int color) {
        colors[node] = color;
        
        for (int neighbor : graph[node]) {
            if (colors[neighbor] == color) {
                return false; // Neighbor has the same color, not bipartite
            }
            
            if (colors[neighbor] == 0 && !dfs(graph, colors, neighbor, -color)) {
                return false; // Recurse on neighbor with opposite color
            }
        }
        
        return true;
    }
}
