class Solution {
    public int numOfStrings(String[] nums, String w) {
        int ans=0;
        for(String s:nums){
            if(w.contains(s))ans++;
        }
        return ans;
    }
}