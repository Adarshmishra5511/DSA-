import java.util.*;
public class allpath {
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
      graph[0].add(new Edge(0,3));
      graph[5].add(new Edge(5,0));
      graph[5].add(new Edge(5,2));
      graph[2].add(new Edge(2,3));
      graph[3].add(new Edge(3,1));
      graph[4].add(new Edge(4,1));
      graph[4].add(new Edge(4,0));
   }
   public static void printallpath(ArrayList<Edge>graph[],int src,int des,String path){
      if(src==des){
         System.out.println(path+des);
         return;
      }
      for(int i=0;i<graph[src].size();i++){
         Edge e= graph[src].get(i);
         printallpath(graph, e.des, des, path+src);
      }
   }
   public static void main(String[] args) {
      int v=6;
      ArrayList<Edge>graph[]=new ArrayList[v];
      createGraph(graph);
      int src=5; 
      int des=1;
      printallpath(graph, src, des, "");
   }
} 
