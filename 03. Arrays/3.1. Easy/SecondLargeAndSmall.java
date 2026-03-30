import java.util.Arrays;

public class SecondLargeAndSmall {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Handle small arrays
        if (n < 2) return new int[]{};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Finding Second Largest
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }

            // Finding Second Smallest
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }

        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] result = getSecondOrderElements(a.length, a);
        System.out.println("Second Largest and Second Smallest: " + Arrays.toString(result));
    }
}
