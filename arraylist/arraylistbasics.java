import java.util.ArrayList;
public class arraylistbasics {
  public static void main(String[] args) {
    ArrayList<Integer>List=new ArrayList<>();
    List.add(1);
    List.add(2);
    List.add(3);
    List.add(4);
    List.add(5);
    System.out.println(List);
    //get elemnt
   // int element=List.get(2);
    //System.out.println(element);
    ///remove element
   /// List.remove(2);
    ///System.out.println(List);
    ////set element
    ////List.set(2,10);
    ////System.out.println(List);
    List.add(1,9);
    System.out.println(List);
  }
}
