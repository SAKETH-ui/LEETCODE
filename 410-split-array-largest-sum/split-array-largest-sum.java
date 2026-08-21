class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length)return -1;
        int low=0,high=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>low)low=nums[i];
            high+=nums[i];
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(func(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static boolean func(int nums[],int p,int m){
        int c=1,s=0;
        for(int i=0;i<nums.length;i++){
            if(s+nums[i]<=p)s+=nums[i];
            else{
                s=nums[i];
                c++;
            }
        }
        return c<=m;
    }
}