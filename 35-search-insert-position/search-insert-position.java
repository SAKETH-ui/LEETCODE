class Solution {
    public int searchInsert(int[] nums, int target) {
        int x=-1,i=0;
        while(i<nums.length){
            if(nums[i]==target)return i;
            if(nums[i]>target)break;
            i++;
        }
        return i;
    }
}