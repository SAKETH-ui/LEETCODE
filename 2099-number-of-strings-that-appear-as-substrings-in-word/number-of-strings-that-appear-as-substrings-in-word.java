class Solution {
    public int numOfStrings(String[] nums, String w) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(w.contains(nums[i]))ans++;
        }
        return ans;
    }
}