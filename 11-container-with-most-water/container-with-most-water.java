class Solution {
    public int maxArea(int[] nums) {
        int m=0,a=0,i=0,j=nums.length-1;
        while(i<j){
            a=(Math.min(nums[i],nums[j]))*(j-i);
            m=Math.max(a,m);
            if(nums[i]<nums[j])
            i++;
            else
            j--;
        }
        return m;

    }
}