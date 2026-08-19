class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int max=nums[0];
        for(int x:nums){
            if(max<x)max=x;
        }
        int low=1,high=max,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum<=t){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}