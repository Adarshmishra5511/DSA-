public class BinomialHeap {
    private Node head;

    private static class Node {
        int key;
        int degree;
        Node parent;
        Node child;
        Node sibling;

        public Node(int key) {
            this.key = key;
            this.degree = 0;
            this.parent = null;
            this.child = null;
            this.sibling = null;
        }
    }

    public void insert(int key) {
        Node newNode = new Node(key);
        if (head == null) {
            head = newNode;
        } else {
            merge(newNode);
        }
    }

    private void merge(Node newNode) {
        if (newNode.degree < head.degree) {
            newNode.sibling = head;
            head = newNode;
        } else {
            Node currentNode = head;
            Node prevNode = null;
            while (currentNode != null && currentNode.degree <= newNode.degree) {
                prevNode = currentNode;
                currentNode = currentNode.sibling;
            }

            if (prevNode != null) {
                prevNode.sibling = newNode;
            } else {
                head = newNode;
            }
            newNode.sibling = currentNode;

            // This line fixes the bug:
            if (prevNode != null && prevNode.sibling != null && prevNode.sibling.key == newNode.key) {
                link(prevNode.sibling, newNode);
                prevNode.sibling = newNode.sibling;
            }
        }

        while (head != null && head.sibling != null) {
            if (head.degree == head.sibling.degree) {
                if (head.key < head.sibling.key) {
                    link(head, head.sibling);
                } else {
                    link(head.sibling, head);
                }
            }
            head = head.sibling;
        }
    }

    private void link(Node min, Node max) {
        min.sibling = max.sibling;
        max.sibling = min.child;
        min.child = max;
        max.parent = min;
        min.degree++;
    }

    public void printHeap() {
        if (head == null) {
            System.out.println("Heap is empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.key);
            currentNode = currentNode.sibling;
        }
    }

    public static void main(String[] args) {
        BinomialHeap heap = new BinomialHeap();

        // Insert the elements 10, 5, 20, 3, 15, and 10 (again) into the heap.
        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(3);
        heap.insert(15);
        heap.insert(10);

        // Print the heap.
        heap.printHeap();
    }
}
