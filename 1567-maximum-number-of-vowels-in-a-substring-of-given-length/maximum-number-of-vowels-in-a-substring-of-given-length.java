class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        max = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {
            
            // Add new character
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }

            // Remove old character
            if ("AEIOUaeiou".indexOf(s.charAt(i - k)) != -1) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}