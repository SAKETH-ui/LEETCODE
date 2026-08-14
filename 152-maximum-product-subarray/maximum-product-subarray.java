class Solution {
    public int maxProduct(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
            m=Math.max(m,p);
            }
        }
        return m;
    }
}