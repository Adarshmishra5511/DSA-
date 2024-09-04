public class HeapsoTt {
   public static void heapSort(int[] arr) {
       int n = arr.length;

       // Build a max heap
       for (int i = n / 2 - 1; i >= 0; i--) {
           heapify(arr, n, i);
       }

       // Extract elements from the heap one by one
       for (int i = n - 1; i > 0; i--) {
           // Swap the root (max element) with the last element
           int temp = arr[0];
           arr[0] = arr[i];
           arr[i] = temp;

           // Call heapify on the reduced heap
           heapify(arr, i, 0);
       }
   }

   // Heapify a subtree rooted at index i
   public static void heapify(int[] arr, int n, int i) {
       int largest = i;
       int leftChild = 2 * i + 1;
       int rightChild = 2 * i + 2;

       // Find the largest element among the root, left child, and right child
       if (leftChild < n && arr[leftChild] > arr[largest]) {
           largest = leftChild;
       }

       if (rightChild < n && arr[rightChild] > arr[largest]) {
           largest = rightChild;
       }

       // If the largest element is not the root, swap them and recursively heapify the affected sub-tree
       if (largest != i) {
           int swap = arr[i];
           arr[i] = arr[largest];
           arr[largest] = swap;

           // Recursively heapify the affected sub-tree
           heapify(arr, n, largest);
       }
   }

   public static void main(String[] args) {
       int[] arr = {12, 11, 13, 5, 6, 7};
       heapSort(arr);

       System.out.println("Sorted array:");
       for (int value : arr) {
           System.out.print(value + " ");
       }
   }
}
