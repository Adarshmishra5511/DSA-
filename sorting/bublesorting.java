package sorting;
import java.util.*;
public class bublesorting {
  public static void bubbleSort(int arr []){
    for( int i=0;i<arr.length-1;i++){
      for (int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j] ;
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        }
      }
    }
  }
  public static void printArr(int arr[]) {
    for (int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println( "the sorted array is: ");
  }
  public static void main(String[] args) {
    //int arr[]={5,4,1,3,2};
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of the array : ");
   int n=sc.nextInt();
    
    int arr[]=new int[n];
    System.out.println("enter the unsorted array: ");
    for (int i=0;i<n;i++)
  
    arr[i]=sc.nextInt();
    bubbleSort(arr);
    printArr(arr);
  }
}
