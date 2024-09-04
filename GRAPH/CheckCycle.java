import java.util.*;

public class CheckCycle {
    static class Edge {
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //graph[0].add(new Edge(0,1));
         graph[0].add(new Edge(0,2));
         graph[0].add(new Edge(0,3));
        // graph[1].add(new Edge(1,0));
         graph[1].add(new Edge(1,2));
         graph[2].add(new Edge(2,1));
         graph[2].add(new Edge(2,0));
         graph[2].add(new Edge(2,4)); 
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // Check if the neighbor has not been visited
            if (!vis[e.des]) {
                if (detectCycleUtil(graph, vis, e.des, curr)) {
                    return true;
                }
            }
            // Check if the neighbor is not the parent of the current node
            else if (e.des != par) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
