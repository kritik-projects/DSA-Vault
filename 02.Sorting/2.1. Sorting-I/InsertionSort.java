import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n) {
        // 1. We start from the second element (index 1)
        // because a single element is already "sorted"
        for (int i = 1; i < n; i++) {
            int j = i;
            
            // 2. Keep swapping the element with its left neighbor
            // as long as it's smaller than the neighbor
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                
                // Move the pointer to the left to keep checking
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSort(arr, n);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
