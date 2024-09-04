import java.util.*;
import java.util.LinkedList;

public class CheapestFlight {
    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.des = d;
            this.wt = wt;
        }
    }

    public static void createGraph(int flight[][], ArrayList<Edge> graph[]) {
        int flightLength = flight.length;
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flightLength; i++) {
            int src = flight[i][0];
            int des = flight[i][1];
            int wt = flight[i][2];
            Edge e = new Edge(src, des, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n, int flight[][], int src, int des, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flight, graph);
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<CheapestFlight.Info> q = new LinkedList<CheapestFlight.Info>();

        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) {
                break;
            }
            for (Edge e : graph[curr.v]) {
                int u = e.src;
                int v = e.des;
                int wt = e.wt;

                if (curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        if (dist[des] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[des];
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0;
        int des = 3;
        int k = 1;

        int result = cheapestFlight(n, flights, src, des, k);
        System.out.println("Cheapest Flight Cost: " + result);
    }
}
