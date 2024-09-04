public class deleteNthnode {
  public static class LinkedList {
    public static class Node {
      int data;
      Node next;
      
      public Node(int data) {
        this.data = data;
        this.next = null;
      }
    }
  
    public static Node head;
    public static Node tail;
    
    public void addLast(int data) {
      Node newNode = new Node(data);
      
      if (head == null) {
        head = tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }
    
    // print linked list
    public void print() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
      System.out.println("null");
    }
    
    public void deleteNthNode(int n) {
      int sz = 0;
      Node temp = head;
      while (temp != null) {
        sz++;
        temp = temp.next;
      }
      
      int i = 1;
      int itofind = sz - n;
      Node prev = head;
      while (i < itofind) {
        prev = prev.next;
        i++;
      }
      
      prev.next = prev.next.next;
    }
  }
  
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.print();
    
    ll.deleteNthNode(2);
    ll.print();
  }
}
