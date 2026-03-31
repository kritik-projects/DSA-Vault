public class CheckSortedArray {
    public static boolean isSorted(int n, int[] a) {
        // 1. Iterate from the start to the second-to-last element
        for (int i = 0; i < n - 1; i++) {
            // 2. If any element is greater than the next one, it's not sorted
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        // 3. If we finish the loop, the array is sorted
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 8, 4, 5 };

        System.out.println("Is arr1 sorted? " + isSorted(arr1.length, arr1)); // true
        System.out.println("Is arr2 sorted? " + isSorted(arr2.length, arr2)); // false
    }
}
