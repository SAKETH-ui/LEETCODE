class Solution {
    public int firstUniqueEven(int[] nums) {
      int m=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)m=Math.max(m,nums[i]);
      int []h=new int[m+1];
        for(int i=0;i<nums.length;i++)h[nums[i]]++;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0&&h[nums[i]]==1)return nums[i];
        }
        return -1;
    }
}