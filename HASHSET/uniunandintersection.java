import java.util.*;
public class uniunandintersection{
   public static void main(String[] args) {
      
     int  arr1[]={1,2,3,4};
     int  arr2[]={3,4,5,6};
     HashSet<Integer>set=new HashSet<>();
     //union
     for(int i=0 ;i<arr1.length;i++){
      set.add(arr1[i]);
     }
     for(int i=0;i<arr2.length;i++){
      set.add(arr2[i]);
     }
     System.out.println("union="+set.size());
     for(Integer s:set){
      System.out.println(s);
     }

    //intersection
    set.clear();
    for(int i=0;i<arr1.length;i++){
      set.add(arr1[i]);
    }
    int count =0;
    for(int i=0;i<arr2.length;i++){
      if (set.contains(arr2[i])){
        count ++;
        set.remove(arr2[i]);
      }
    }
    System.out.println("inetrsection="+count);
    for (Integer s  : set) {
      System.err.println( s);
    }
}
}

