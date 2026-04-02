import java.util.Arrays;

public class LeftRotate {
    public static int[] rotateArray(int[] arr, int n) {
        if (n <= 1) return arr;

        // 1. Store the first element
        int firstElement = arr[0];

        // 2. Shift all elements from index 1 to n-1 one position left
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        // 3. Put the first element at the last index
        arr[n - 1] = firstElement;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Original: " + Arrays.toString(arr));
        rotateArray(arr, n);
        System.out.println("Rotated by 1: " + Arrays.toString(arr));
    }
}
