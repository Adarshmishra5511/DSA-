public  class clearithbit{
  public static int ClearIthBit(int n,int i ){
   int bitmask=~(1<<i);//complement of i
   return n & bitmask;//and with bitmask
  }
   public static void main(String[] args) {
    System.out.println(ClearIthBit(10,1));//n is given no and i is ith bit of that no
   
  }
}
 