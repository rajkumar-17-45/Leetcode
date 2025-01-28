import java.util.*;

class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        // Step 1: Map node indices to labels
        HashMap<Integer, Character> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(i, labels.charAt(i));  // Storing each node's label
        }
        
        // Step 2: Initialize result array and visited array
        int total[] = new int[n];  // Stores the total count of the node's label in its subtree
        int visited[] = new int[n]; // Marks nodes as visited during DFS
        
        // Step 3: Create adjacency list for the graph
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new ArrayList<>());
        }
        
        // Step 4: Build the graph from the given edges
        for (int[] x : edges) {
            l.get(x[0]).add(x[1]);
            l.get(x[1]).add(x[0]);
        }
        
        // Step 5: Start DFS traversal from each node if not visited
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(mp, l, visited, total, i);  // DFS for each unvisited node
            }
        }
        
        // Step 6: Return the final count array
        return total;
    }
    
    // Step 7: DFS function to calculate label counts in each node's subtree
    HashMap<Character, Integer> dfs(HashMap<Integer, Character> mp, List<List<Integer>> li, int visited[], int total[], int node) {
        visited[node] = 1;  // Mark current node as visited
        
        // HashMap to store label counts for the current node's subtree
        HashMap<Character, Integer> pl = new HashMap<>();
        
        // Step 8: Process each child node
        for (int i : li.get(node)) {
            if (visited[i] == 0) {
                // Step 9: Recursive DFS call for the child node
                HashMap<Character, Integer> res = dfs(mp, li, visited, total, i);
                
                // Step 10: Merge child node's label counts into the current node's count
                for (Character c : res.keySet()) {
                    pl.put(c, pl.getOrDefault(c, 0) + res.get(c)); // Merge counts
                }
            }
        }
        
        // Step 11: Add the label count for the current node
        char c = mp.get(node);  // Get the label of the current node
        pl.put(c, pl.getOrDefault(c, 0) + 1);  // Increment the count of the current node's label
        
        // Step 12: Store the final result for the current node (how many times its label appears in its subtree)
        total[node] = pl.get(c);  // Set the count of the current node's label in its subtree
        
        return pl;  // Return the accumulated label counts for the current node's subtree
    }
}
