class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int count = 0;
        int suffixSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i != n - 1) {
                int len = n - i - 1;
                if (nums[i] * len > suffixSum) {
                    count++;
                }
            }
            suffixSum += nums[i];
        }
        return count;
    }
}