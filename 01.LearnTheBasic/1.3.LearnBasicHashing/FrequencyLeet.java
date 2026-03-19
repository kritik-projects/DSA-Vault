import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyLeet {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        // 1. Use a HashMap to store frequencies: O(n) time
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Convert the Map entries into a List of Lists: O(k) where k is unique elements
        List<List<Integer>> result = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());    // The Unique Element
            pair.add(entry.getValue());  // Its Frequency
            result.add(pair);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3};
        List<List<Integer>> output = countFrequencies(nums);
        
        // Printing the result
        System.out.println(output); 
        // Example Output: [[1, 2], [2, 2], [3, 1]]
    }
}
