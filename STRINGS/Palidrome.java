
public class Palidrome {
  public void printletter(String str){
    int n=str.length();
    for(int i=0;i<n;i++){
      System.out.print(str.charAt(i)+ " ");
    }
    System.out.println();
  }
  public static boolean ispalidrome(String str){
    for(int i=0;i<str.length()/2;i++){
      int n=str.length();
      if(str.charAt(i)!=str.charAt(n-1-i)){
        return false;
      }
    }
      return true;
  }
  public static void main(String[] args) {
    String str="123454320";
    System.out.println(ispalidrome(str));
  }
}
