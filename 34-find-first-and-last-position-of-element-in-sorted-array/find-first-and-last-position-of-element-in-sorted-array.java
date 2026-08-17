class Solution {
    public int[] searchRange(int[] nums, int t) {
        int n=nums.length;
        int low=0,high=n-1;
        int a[]={-1,-1};
        while(low<=high){
            int m=low+(high-low )/2;
            if(nums[m]==t){
                a[0]=m;
                high=m-1;
            }
            else if(nums[m]>t)high=m-1;
            else low=m+1;
        }
        low=0;
        high=n-1;
        while(low<=high){
            int m=low+(high-low )/2;
            if(nums[m]==t){
                a[1]=m;
                low=m+1;
            }
            else if(nums[m]<t)low=m+1;
            else high=m-1;
        }
        return a;
    }
}