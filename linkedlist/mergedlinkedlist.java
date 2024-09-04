
import java.util.LinkedList;
public class mergedlinkedlist {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node getMid(Node head) {
    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public Node merge(Node head1, Node head2) {
    Node mergedll = new Node(-1);
    Node temp = mergedll;
    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
      }
      temp = temp.next;
    }
    temp.next = (head1 != null) ? head1 : head2;
    return mergedll.next;
  }

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    // find mid
    Node mid = getMid(head);
    // left and right merged sort
    Node righthead = mid.next;
    mid.next = null;
    Node newleft = mergeSort(head);
    Node newright = mergeSort(righthead);
    // merge
    return merge(newleft, newright);
  }

  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.addLast(5);
    ll.addLast(4);
    ll.addLast(3);
    ll.addLast(2);
    ll.addLast(1);
    System.out.println(ll);
    mergedlinkedlist obj = new mergedlinkedlist();
    ll.head = mergeSort(ll.head);
    System.out.println(ll);
  }
}
