class Solution {
    public int longestSubarray(int[] nums) {
        int c=0,l=0,s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];

            while(s+1<i-l+1){
                s-=nums[l++];
            }
            c=Math.max(c,i-l+1);
        }

        return c-1;
    }
}