//  import java.util.*;
//  public class fractionalkanpsack {
//   public static void main(String[] args) {
//     int val[]={60,100,120};
//     int weigth[]={10,20,30};  
//     int W=50;
//     //use 2d array to sort
//     double ratio[][]=new double[val.length][2];
//     //oth=>idx;1th=>ratio
//     for(int i=0;i<val.length;i++){
//       ratio[i][0]=i;
//       ratio[i][1]=val[i]/(double)weigth[i];
//     }
//       //sort into ascending oordre
//       Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
//       int capacity=W;
//       int finalval=0;
//       for(int i=ratio.length-1;i>0;i--){
//         int idx=(int)ratio[i][0];
//         if(capacity>=weigth[idx]){
//         finalval += val[idx];
//         capacity -= weigth[idx];       
//       }
//       else{
//         finalval+=(ratio[i][1]*capacity);
//         capacity=0;
//         break;
//       }
//     }
//     System.out.println("final value="+finalval);
//     }
  
// }
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];

        // Calculate the value-to-weight ratio for each item
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / weight[i];
        }

        // Sort items by the ratio in descending order
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        int capacity = W;
        double finalValue = 0.0;

        for (int i = 0; i < ratio.length && capacity > 0; i++) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
            }
        }

        System.out.println("Maximum value that can be obtained: " + finalValue);
    }
}
