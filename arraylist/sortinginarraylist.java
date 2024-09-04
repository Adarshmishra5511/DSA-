import java.util.ArrayList;
import java.util.*;
public class sortinginarraylist {
  public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(3);
    list.add(2);
    list.add(1);
    list.add(9);
    list.add(8);
    System.out.println(list);
  Collections.sort(list);//ascendiong
  System.out.println(list);
  Collections.sort(list,Collections.reverseOrder());
  System.out.println(list);
}
}
