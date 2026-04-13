class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum =totalSum + nums[i];
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum =leftSum+nums[i];
        }
        return -1;


      /*  int r=-1;
        for(int i=0;i<a.length;i++){
            if(i==0){
                if((a[a.length-1]-a[i])==0)r=i;
                break;
            }else if(a[i-1]==(a[a.length-1]-a[i]))r=i;
        }return r;
        */
    }
}