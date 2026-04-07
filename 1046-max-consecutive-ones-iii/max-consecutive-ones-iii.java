class Solution {
    public int longestOnes(int[] nums, int k) {
        int ms=0,s=0,l=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0)s++;
            while(s>k){
                if(nums[l]==0)s--;
                l++;
            }

            ms=Math.max(i-l+1,ms);
        }return ms;
    }
}