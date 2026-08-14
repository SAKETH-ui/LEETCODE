class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int p=1,rp=1,m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            p=p*nums[i];
            rp=rp*nums[n-i-1];
            m1=Math.max(m1,p);
            m2=Math.max(m2,rp);
            if(p==0)p=1;
            if(rp==0)rp=1;
        }
        return Math.max(m1,m2);
    }
}