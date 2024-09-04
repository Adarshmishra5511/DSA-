package backtacking;

public class substring {
  public static void findSubstring(String str,String ans,int i){
    //base case
    if(i==str.length()){
      if(str.length()==0){
      System.out.println(null);
    }
    else{
      System.out.println(ans);
    }
    return;
  } 
  //kaam
  //yes choice
  findSubstring(str,ans+str.charAt(i),i+1);
  //no choice
  findSubstring(str,ans,i+1);}

public static void main(String[] args) {
  String str="abcdef";
  findSubstring(str,"",0);
 }
}
