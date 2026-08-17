class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int min=5000;
        while(low<=high){
            int m=low+(high-low)/2;
            // if(nums[m]==t){
            //     return m;
            // }else 
            if(nums[m]>=nums[low]){
                min=Math.min(min,nums[low]);
                low=m+1;
            }else {
                min=Math.min(min,nums[m]);
                high=m-1;
            }
        }
        return min;
    }
}