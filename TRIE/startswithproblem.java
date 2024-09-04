public class startswithproblem { 
   static class Node{
      Node[] children;
      boolean eow;

      public Node(){
         children=new Node[26];
         for(int i=0;i<26;i++){
            children[i]=null;
         }
         eow=false;
      }
   }
   static Node root=new Node();
   //insert in trie
   public static void insert(String word){
      Node curr=root;
      for (int i=0;i<word.length();i++){
         int idx=word.charAt(i)-'a';
         if(curr.children[idx]==null){
            //add new node
            curr.children[idx]=new Node();
         }
         if(i==word.length()-1){
            curr.children[idx].eow=true;
         }
         curr=curr.children[idx];
      }
   }
   //for search
   public static boolean search(String key){
      Node curr=root;
      for(int i=0;i<key.length();i++){
         int idx=key.charAt(i)-'a';
            Node node=curr.children[idx];
            if(node==null){ 
               return false;
            }
            if(i==key.length()-1 && node.eow==false){
               return false;
            }
            curr=curr.children[idx];
      }
      return true;
   }
   
      
//    public static boolean wordbreak(String key) {
//       int n = key.length();
//       if (n == 0) {
//           return true;
//       }
  
//       for (int i = 1; i <= n; i++) {
//           String firstPart = key.substring(0, i);
//           String secondPart = key.substring(i);
          
//           // Check if the first part is in the dictionary
//           if (search(firstPart) && wordbreak(secondPart)) {
//               return true;
//           }
//       }
//       return false;
//   }
  public static boolean startwith(String prefix){
   Node curr=root;
   for(int i=0;i<prefix.length();i++){
       int idx=prefix.charAt(i)-'a';
       if(curr.children[idx]==null){
         return false;
      }
       curr=curr.children[idx];
   }
   return true;
  }
   public static void main(String[] args) {
      String word[]={"apple","app","mango","man","women"};
      String preifix="moon";
      for(int i=0;i<word.length;i++){
         insert( word[i]);
      }
      System.out.println(startwith(preifix));
   }
}
 

   

