public class LargestBSTinBT {
  static class Node {
      int data;
      Node left, right;

      public Node(int data) {
          this.data = data;
          this.left = this.right = null;
      }
  }

  static class Info {
      boolean isBST;
      int size;
      int min;
      int max;
      Node node;

      public Info(boolean isBST, int size, int min, int max, Node node) {
          this.isBST = isBST;
          this.size = size;
          this.min = min;
          this.max = max;
          this.node = node;
      }
  }

  public static int maxBST = 0;
  public static Node largestBSTNode = null;

  public static Info largestBST(Node root) {
      if (root == null) {
          return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, null);
      }

      Info leftInfo = largestBST(root.left);
      Info rightInfo = largestBST(root.right);

      int size = leftInfo.size + rightInfo.size + 1;
      int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
      int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

      if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
          return new Info(false, size, min, max, null);
      }

      if (leftInfo.isBST && rightInfo.isBST) {
          maxBST = Math.max(maxBST, size);
          largestBSTNode = root;
          return new Info(true, size, min, max, root);
      }

      if (leftInfo.size > rightInfo.size) {
          largestBSTNode = leftInfo.node;
      } else {
          largestBSTNode = rightInfo.node;
      }

      return new Info(false, size, min, max, largestBSTNode);
  }

  public static void main(String[] args) {
      Node root = new Node(50);
      root.left = new Node(30);
      root.left.left = new Node(5);
      root.left.right = new Node(20);
      root.right = new Node(66);
      root.right.left = new Node(45);
      root.right.right = new Node(70);
      root.right.right.left = new Node(65);
      root.right.right.right = new Node(80);

      Info info = largestBST(root);
      System.out.println("Largest isBST: " + maxBST);
      System.out.println("Node values in the largest BST:");
      printNodeValues(largestBSTNode);
  }

  public static void printNodeValues(Node node) {
      if (node == null) {
          return;
      }

      printNodeValues(node.left);
      System.out.print(node.data + " ");
      printNodeValues(node.right);
  }
}
