class Solution {
    public int search(int[] nums, int t) {
        int n=nums.length;
        int low=0,high=n-1,a=-1;
        while(low<=high){
            int m=low+(high-low)/2;
            if(nums[m]==t){
                a=m;
                break;
            }else if(nums[m]>=nums[low]){
                if(nums[m]>=t&&t>=nums[low])
                high=m-1;
                else low=m+1;
            }else {
                if(nums[m]<=nums[high]){
                    if(nums[m]<=t&&t<=nums[high])
                    low=m+1;
                    else high=m-1;
                }
            }
        }
        return a;
}}