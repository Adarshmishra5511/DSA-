import java.util.*;
 public class fibonnciseries {
  public static int fib(int n){
    if (n==0||n==1){
      return n;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    int fn=fnm1+fnm2;
    return fn;
  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the term whose fi b you wnt to print");
    int n=sc.nextInt();
    int number[]=new int [n];
    System.out.println("the fib no of thr term is:" +fib(n));
  }
  
}
