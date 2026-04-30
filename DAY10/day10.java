package DAY10;
import java.util.*;

public class day10 {
    // Graphs
    public class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

    }
    public static void main(String[] args) {
        day10 graph = new day10();
        int vertex = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        for(int i=0;i<vertex;i++){
            graph[i] = new ArrayList<>();
        }
        //printing the graph
        for(int i=0;i<graph.length;i++){
            System.out.print("Vertex " + i + " Neighbors: ");
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.print(e.src + "->" + e.dest);
            }
            System.out.println(" ");
        }
    }
}
