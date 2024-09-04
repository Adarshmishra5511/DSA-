public class setithbit{
  public static int setIthBit(int n,int i ){
   int bitmask=1<<i;
   return n | bitmask;//oring with bitmask
  }
   public static void main(String[] args) {
    System.out.println(setIthBit(10,2));//n is given no and i is ith bit of that no
   
  }
}
