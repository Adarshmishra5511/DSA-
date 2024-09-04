package backtacking;

public class permutationbacktarcking {
  public static void findpermutation(String str,String ans){
    //base case
    if (str.length()==0){
      System.out.println(ans);
      return;
    }
    //recursion
    for(int i=0;i<str.length();i++){
      char curr=str.charAt(i);
      String Newstr=str.substring(0,i)+str.substring(i+1);
      findpermutation(Newstr,ans+curr);
    }
  }
  public static void main(String[] args) {
    String str="abcde";
    findpermutation(str,"");
  }
}
