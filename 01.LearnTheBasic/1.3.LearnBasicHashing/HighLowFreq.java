import java.util.*;

public class HighLowFreq {
    public static int[] getFrequencies(int[] v) {
        // 1. Create a Frequency Map
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : v) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = v.length;
        int maxEle = Integer.MAX_VALUE;
        int minEle = Integer.MAX_VALUE;

        // 2. Single pass through the map to find result
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            // Check for Max Frequency
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            } else if (count == maxFreq) {
                // Tie-breaker: pick the smaller element
                maxEle = Math.min(maxEle, element);
            }

            // Check for Min Frequency
            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            } else if (count == minFreq) {
                // Tie-breaker: pick the smaller element
                minEle = Math.min(minEle, element);
            }
        }

        return new int[]{maxEle, minEle};
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 1, 1, 4};
        int[] result = getFrequencies(v);
        
        System.out.println("Max Freq Element: " + result[0]); // Output: 1
        System.out.println("Min Freq Element: " + result[1]); // Output: 2 (Smallest among 2, 3, 4)
    }
}
