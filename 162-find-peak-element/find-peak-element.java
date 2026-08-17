class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[n-1]>nums[n-2])return n-1;

        int low=1,high=n-2;

        while(low<=high){
            int m=low+(high-low)/2;
            if(nums[m]>nums[m+1]&&nums[m]>nums[m-1])return m;
            else if(nums[m]>nums[m-1])low=m+1;
            else high=m-1;
        }
        return -1;
    }
}