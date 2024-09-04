import java.util.*;

public class Countdistinct {
   public static void main(String[] args) {
      int arr[]={2,4,43,32,3,4,2,34,45,1,342,1};
      HashSet<Integer>Set=new HashSet<>();
      for(int i=0;i<arr.length;i++){
         Set.add(arr[i]);
      }
      System.out.println("ans="+Set.size());
   }
}
