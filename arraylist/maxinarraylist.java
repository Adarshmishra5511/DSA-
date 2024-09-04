
import java.util.ArrayList;
public class maxinarraylist {
 public static void main(String[] args) {
  ArrayList<Integer>list=new ArrayList<>();
  list.add(5);
  list.add(4);
  list.add(21);
  list.add(44);
  list.add(23);
  int max =Integer.MIN_VALUE;
  for (int i=0;i<list.size();i++){
    if(max<list.get(i)){
      max=list.get(i);
    }
  }
  System.out.println("max element="+ max);
 } 
}
