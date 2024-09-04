

public class Substring{
  public void printletter(String str){
    for (int i=0;i<str.length();i++){
      System.out.println(str.charAt(i)+" ");
    }
    System.err.println();
  }
  public static void main(String[] args) {
    String str="helloWorld";
    System.out.println(str.substring(0,5));
  }
}