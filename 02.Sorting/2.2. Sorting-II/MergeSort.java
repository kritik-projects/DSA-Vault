import java.util.*;

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        // 1. Base Case: If the segment has 1 or 0 elements, it's already sorted
        if (l >= r)
            return;

        int mid = (l + r) / 2;

        // 2. Divide: Recursively sort the left and right halves
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // 3. Conquer: Merge the sorted halves
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid + 1;

        // Compare elements from both halves and add the smaller one to temp
        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If elements are left in the left half, add them
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If elements are left in the right half, add them
        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }

        // Transfer all elements from temp back to the original array
        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
