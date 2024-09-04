import java.util.*;

import javax.swing.plaf.synth.SynthScrollPaneUI;
public class maxActivitiesDone {
 public static void main(String[] args) {
  //int start[]={1,3,0,5,8,5};
  //int end[]={2,4,6,7,9,9};
  //if activiteies are not sort on the basis of end time
  
  //if activites are sort on the basis of end time 
  int maxAct=0;
  ArrayList<Integer>ans=new ArrayList<>();
  //list activity
  maxAct=1;
  ans.add(0);
  int lastend=end[0];
  for(int i=0;i<end.length;i++){
    if(start[i]>=lastend){
      //activity selected
      maxAct++;
      ans.add(i);
      lastend=end[i];
    }
  }
  System.out.println("max activities="+maxAct);
  for(int i=0;i<ans.size();i++){
    System.out.print("A"+ans.get(i)+" ");
  }
  System.out.println();
 } 
}
