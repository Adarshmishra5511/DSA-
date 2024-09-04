import java.util.*;

public class khansalgo {
   static class Edge{
      int src;
      int des;
      public Edge(int s,int d){
         this.src=s;
         this.des=d;

      }
   }
   static void createGraph(ArrayList<Edge>graph[]){
      for(int i=0;i<graph.length;i++){
         graph[i]=new ArrayList <>();
      }
      graph[5].add(new Edge(5,0));
      graph[5].add(new Edge(5,2));
      graph[2].add(new Edge(2,3));
      graph[3].add(new Edge(3,1));
      graph[4].add(new Edge(4,1));
      graph[4].add(new Edge(4,0));
   }
   public static void calcindeg(ArrayList<Edge>graph[],int indeg[]){
      for(int i =0;i<graph.length;i++){
         int v=i;
         for(int j=0;j<graph[v].size();j++){
            Edge e=graph[v].get(j);
            indeg[e.des]++;
         }
      }
   }
   public static void toplogicalsort(ArrayList<Edge>graph[]){
      int indeg[]=new int [graph.length];
      calcindeg(graph, indeg);
      Queue<Integer>q=new LinkedList<>();
      for(int i=0;i<indeg.length;i++){
         if(indeg[i]==0){
            q.add(i);
         }
      }
      //bfs
     while (!q.isEmpty()) {
        int curr = q.remove();
        System.out.print(curr + " ");
        

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            indeg[e.des]--;
            if (indeg[e.des] == 0) { 
                q.add(e.des);
            }
        }
    }
System.out.println();
   }


   
   public static void main(String[] args) {
      int v=6;
      ArrayList<Edge>graph[]=new ArrayList[v];
      createGraph(graph);
        toplogicalsort(graph);
   } 
}


