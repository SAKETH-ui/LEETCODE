class Solution {
    public int minDays(int[] nums, int m, int k) {
        if((long)m*k>nums.length)return -1;
        int max=nums[0],min=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int ans=max;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(possible(nums,mid,m,k)){
                ans=mid;
                max=mid-1;
            }
            else {
                min=mid+1;
            }
        }
        return ans;
    }
    static boolean possible(int []a,int d,int m,int k){
        int c=0,b=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=d){
                c++;
            }
            else {
                b+=c/k;
                c=0;
            }
        }
        b+=c/k;
        if(b>=m)return true;
        else return false;
    }
}