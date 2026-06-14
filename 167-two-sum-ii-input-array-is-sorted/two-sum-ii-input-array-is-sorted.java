class Solution {
    public int[] twoSum(int[] nums, int t) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>t){
                j--;
            }
            else if(nums[i]+nums[j]<t){
                i++;
            }
            else if(nums[i]+nums[j]==t)return new int[]{i+1,j+1};
        }
        return new int[]{-1,-1};
    }
}