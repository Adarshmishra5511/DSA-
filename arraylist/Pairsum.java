import java .util.*;
//public class Pairsum {
  //public static boolean pairsum(ArrayList<Integer>list,int target){
   //// for(int i=0;i<list.size();i++){
     // for(int j=i+1;j<list.size();j++){
       // if(list.get(1)+list.get(2)==target){
         // return true;
        //}
      //}
    //}/
    //return false;
  //} 
  //two pointer approach
  public static boolean pairSum(ArrayList<Integer>list,int target){
    int lp=0; 
    int rp=list.size()-1;
    while(lp!=rp){
      //case1
      if(list.get(lp)+list.get(rp)==target){
        return true;
        
      }
      //case2
      if(list.get(lp)+list.get(rp)<target){
      lp++;
      }
      else{//case3
        rp--;
      }}
    
    return false;

  }
  public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
     list.add(6);
     int target=10;
    System.out.println(pairSum(list, target));
  }
}
