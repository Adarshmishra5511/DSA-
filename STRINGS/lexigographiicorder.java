 import java.util.Arrays;
 public class lexigographiicorder {
  public static void main(String[] args) {
    String fruits[]={"apple", "mango", "banana"};
    String smallest=fruits[0];
    for (int i=1;i>fruits.length;i++){
      if (smallest.compareTo(fruits[i])<0){
       smallest=fruits[i];
      }
    }
    System.out.println(smallest);
  }
}