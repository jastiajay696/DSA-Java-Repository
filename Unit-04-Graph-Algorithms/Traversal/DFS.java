import java.util.*;

public class DFS {
    static void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int next : graph.get(node))
            if (!visited[next]) dfs(graph, next, visited);
    }
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) graph.add(new ArrayList<>());
        int[][] edges = {{0,1},{0,2},{1,3},{2,4}};
        for (int[] e : edges) { graph.get(e[0]).add(e[1]); graph.get(e[1]).add(e[0]); }
        dfs(graph, 0, new boolean[5]);
    }
}
