import java.util.*;
public class storeWater2 {
  public static int storeWater2(ArrayList<Integer>height){
    int maxWater=0;
    int rp=height.size()-1;
    int lp=0;
    while(lp<rp){
      //calculate waterarea
      int ht=Math.min(height.get(lp),height.get(rp));
      int width=rp-lp;
      int currwater=ht*width;
      maxWater=Math.max(maxWater,currwater);
      //update ptr
      if(height.get(lp)<height.get(rp)){
        lp++;
      }else{
        rp--;
      }
    }
    return maxWater;
  }
  public static void main(String[] args) {
    ArrayList<Integer>height=new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
System.out.println(storeWater2(height));
  }
  
}
