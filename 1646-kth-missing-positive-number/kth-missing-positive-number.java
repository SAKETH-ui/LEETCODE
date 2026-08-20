class Solution {
    public int findKthPositive(int[] nums, int k) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((nums[mid]-(mid+1)<k))low=mid+1;
            else high=mid-1;
        }
        return high+1+k; 
    }
}