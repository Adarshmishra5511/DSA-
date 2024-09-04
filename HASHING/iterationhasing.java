import java.util.*;
public class iterationhasing {
   public static void main(String[] args) {
      HashMap<String,Integer>hm=new HashMap<>();
      hm.put("India",150);
      hm.put("us",100);
      hm.put("indonesia",8);
      hm.put("china",140);
      //iterate
    Set<String>keys=hm.keySet();
      System.out.println(keys);
      for(String k:keys){
         System.out.println("keys="+k+",value="+hm.get(k));
      }
   }
   
}
