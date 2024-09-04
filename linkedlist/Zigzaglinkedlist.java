import java.util.LinkedList;


public class Zigzaglinkedlist{
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  public void addFirst(int data){
  //create a new node
  Node newNode=new Node(data);
  size++;
  if(head==null){
    head=tail=newNode;
    return;
  }
  //newNode next=head
  newNode.next=head;
  //head==newNode
  head=newNode;
  }
  public void zigzag(){
    Node slow =head;
    Node fast=head.next;
    while(fast!=null&&fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    Node mid=slow;
    //reveerse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    Node left=head;
    Node right=prev;
    Node nextL,nextR;
  
  //ALT merging-zigzag merge
  while(left!=null&&right!=null){
    nextL=left.next;
    left.next=right;
    nextR=right.next;
    right.next=nextL;
    left=nextL;
    right=nextR;

  }
} 
public String toString() {
  StringBuilder sb = new StringBuilder();
  Node current = head;
  while (current != null) {
    sb.append(current.data).append(" -> ");
    current = current.next;
  }
  sb.append("null");
  return sb.toString();
}
  public static void main(String[] args) {
    Zigzaglinkedlist ll=new Zigzaglinkedlist();
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    System.out.println(ll);
    ll.zigzag();
    System.out.println(ll);
  }
}
