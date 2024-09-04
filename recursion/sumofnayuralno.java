import java.util.*;


public class sumofnayuralno {
  public static int calcsum(int n){
    if (n==1){
      return 1;
    }
    int Snm1=calcsum(n-1);
    int Sn=n+Snm1;
    return Sn;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.println("enter the natural no whose sum you wnt to print");
    int n=sc.nextInt();
    int number[]=new int [n];
    System.out.println("the sum of natural no is :" +calcsum(n));
  }
}
