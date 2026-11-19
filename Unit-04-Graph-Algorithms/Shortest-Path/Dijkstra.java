import java.util.*;

public class Dijkstra {
    static int[] shortestPaths(List<List<int[]>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{source, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0], distance = current[1];
            if (distance != dist[node]) continue;
            for (int[] edge : graph.get(node)) {
                int next = edge[0], weight = edge[1];
                if (distance <= Integer.MAX_VALUE - weight && distance + weight < dist[next]) {
                    dist[next] = distance + weight;
                    pq.offer(new int[]{next, dist[next]});
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) graph.add(new ArrayList<>());
        add(graph, 0, 1, 4); add(graph, 0, 2, 1);
        add(graph, 2, 1, 2); add(graph, 1, 3, 1); add(graph, 2, 3, 5);
        System.out.println(Arrays.toString(shortestPaths(graph, 0)));
    }
    static void add(List<List<int[]>> g, int u, int v, int w) {
        g.get(u).add(new int[]{v, w});
        g.get(v).add(new int[]{u, w});
    }
}
