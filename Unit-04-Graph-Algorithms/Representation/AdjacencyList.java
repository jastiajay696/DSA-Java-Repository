import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        int vertices = 4;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) graph.add(new ArrayList<>());
        addEdge(graph, 0, 1); addEdge(graph, 0, 2);
        addEdge(graph, 1, 3); addEdge(graph, 2, 3);
        for (int i = 0; i < vertices; i++)
            System.out.println(i + " -> " + graph.get(i));
    }
    static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
