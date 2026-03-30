import java.util.*;

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        // Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Sort unique values
        List<Integer> list = new ArrayList<>(freq.keySet());
        Collections.sort(list);

        // Find pair
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            int fx = freq.get(x);

            for (int j = i + 1; j < list.size(); j++) {
                int y = list.get(j);

                if (freq.get(y) != fx) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{-1, -1};
    }
}