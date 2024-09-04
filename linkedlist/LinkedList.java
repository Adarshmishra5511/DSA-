import java.util.*;
public class LinkedList {
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=next;
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
  //add middle
  public void addmid(int idx,int data){
    if(idx==0){
      addFirst(data);
      return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
      temp=temp.next;
      i++;
    }
    newNode.next =temp.next;
    temp.next=newNode;
   }
  //addlastoperation
  public static void addLast(int  data){
    Node newNode=new Node(data);
    size++;
    if (head==null){
      head=tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;
  }
  //print ll
  public void print(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
   }
    //remove first
    public int removeFirst(){
      if(size==0){System.out.println("LL IS EMPTY");
      return Integer.MIN_VALUE;
      }
      else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
      }
      int val=head.data; 
      head=head.next;
      size--;
      return val;
    }

//remove last
public int removelast(){
  if(size==0){
    System.out.println("ll is empty");
    return Integer.MIN_VALUE;
  }
  else if(size==1){
    int value=head.data;
    head=tail=null;
    size=0;
    return value;
  }
  Node prev=head;
  for(int i=0;i<size-2;i++){
    prev =prev.next;
  }
  int value=prev.next.data;
  prev.next=null;
  tail=prev;
  size--;
  return value;
}
//reverse a linked list
public void reverse(){
  Node prev=null;
  Node curr=tail=head;
  Node next;
  while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
  }
  head=prev;
}




private class mergedlinklist {
  public static class Node {
    int data;
    Node next;
    
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  
  
  
  private Node getMid(Node head){
    Node fast=head;
    Node slow =head;
    while(fast!=null&&fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow;
  }
  private Node merge(Node head1,Node head2){
    Node mergedll=new Node(-1);
    Node temp=mergedll;
    while(head1!=null&&head2!=null){
      if(head1.data<=head2.data){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
      }
      else{
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
      }
    }
    while(head1!=null){
      temp.next=head1;
      head1=head1.next;
      temp=temp.next;
    }
    while(head2!=null){
      temp.next=head2;
      head2=head2.next;
      temp=temp.next;
    }
    return mergedll.next;
  }
  public Node mergesort(Node head){
    if(head==null||head.next==null){
      return head;
    }
    //find mid
    Node mid=getMid(head);
    //left and right merged sort
    Node righthead=mid.next;
    mid.next=null;
    Node newleft=mergesort(head);
    Node newright=mergesort(righthead);
    //merge
    return merge(newleft, newright);
  }
  public static void main(String[] args) {
  LinkedList ll=new LinkedList();
    ll.addLast(5);
    ll.addLast(4);
    ll.addLast(3);
    ll.addLast(2);
    ll.addLast(1);
    System.out.println(ll);
    ll.head=ll.mergesort(ll.head);
    System.out.println(ll);
  }
}





}



  

