package sorting;

public class insertionsort {
  
  public static void sort(int arr[]){
  for(int i=0;i<arr.length;i++){
    int curr=arr[i];
    int prev=i-1;
//findig the cutrent position
     while(prev>=0 && arr[prev]>curr){
      arr[prev+1]=arr[prev];
      prev--;
     }
     arr[prev+1]=curr;
  }
}
public static void main(String[] args) {
  int arr[]={9,8,7,6,5,4,3,2,1,0};
  sort(arr);
  for(int i=0;i<arr.length;i++){
  System.out.print(arr[i]+" ");
}}
}