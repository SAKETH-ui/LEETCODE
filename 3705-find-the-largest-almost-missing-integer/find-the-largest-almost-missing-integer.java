class Solution {
    public int largestInteger(int[] nums, int k) {
        int max=0;
        for(int x:nums){
            if(x>max)max=x;
        }
        int h[]=new int[max+1];
        for(int i=0;i<=nums.length-k;i++){
            boolean[]seen=new boolean[max+1];
            for(int l=i;l<=i+k-1;l++){
                int val=nums[l];
                if(!seen[val]){
                    h[val]++;
                    seen[val]=true;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<h.length;i++){
            if(h[i]==1){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}