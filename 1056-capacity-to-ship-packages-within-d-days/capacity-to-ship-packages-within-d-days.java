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
        for(int x:nums){
            
            if(w+x>mid){
                dayss+=1;
                w=x;
            }
            else w+=x;
        }
            if(dayss<=d){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    
}