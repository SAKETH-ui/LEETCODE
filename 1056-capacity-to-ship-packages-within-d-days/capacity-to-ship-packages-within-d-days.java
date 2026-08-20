class Solution {
    public int shipWithinDays(int[] nums, int d) {
        int low=0,high=0;
        for(int x:nums){
            low=Math.max(low,x);
            high+=x;
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int dayss=1,w=0;
        for(int i=0;i<nums.length;i++){
            
            if(w+nums[i]>mid){
                dayss+=1;
                w=0;
                w+=nums[i];
            }
            else w+=nums[i];
        }
            if(dayss<=d){
                ans=mid;
                high=mid-1;
            }
            else if(dayss>d)low=mid+1;
        }
        return ans;
    }
    
}