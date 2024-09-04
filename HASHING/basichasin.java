import java.util.*;
 public class basichasin{
   public static void main(String[] args) {
      //create
      HashMap<String,Integer>hm=new HashMap<>();
      //insert
      hm.put("India",150);
      hm.put("china",140);
      hm.put("nepal",50);
      System.out.println(hm);
      //get
      System.out.println(hm.get("India"));
      //contains.key
      System.out.println(hm.containsKey("India"));
      //remove
      System.out.println(hm.remove("nepal"));
      //size
      System.out.println(hm.size());
      //clear
      hm.clear();
      //isEmpty
      System.out.println(hm.isEmpty());
   }
}