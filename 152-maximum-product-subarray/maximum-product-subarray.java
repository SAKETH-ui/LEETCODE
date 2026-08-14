class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=nums[0],min=nums[0],p=nums[0];
        for(int i=1;i<n;i++){
            int c=nums[i];
            if(c<0){int t=max;
        max=min;
        min=t;}
            
            max=Math.max(c,c*max);
            min=Math.min(c,min*c);
            p=Math.max(max,p);
            
        }
        return p;
    }
    static void swap(int a,int b){
        
    }
}