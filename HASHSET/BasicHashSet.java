import java.util.*;
public class BasicHashSet {
   public static void main(String[] args) {
      HashSet<Integer>hs=new HashSet<>();
      hs.add(1);
      hs.add(2);
      hs.add(3);
      hs.add(1);
      hs.add(2);
      System.out.println(hs);
      hs.remove(3);
      System.out.println(hs);
      System.out.println(hs.size());
      hs.clear();
      System.out.println(hs.isEmpty());
   }
}
