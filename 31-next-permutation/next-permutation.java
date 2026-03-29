class Solution {
    void nextPermutation(int[] nums) {
        int p=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        
        if(p==-1){
            reverse(nums,0,n-1);
            return;
        }
        
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[p]){
                int t=nums[i];
                nums[i]=nums[p];
                nums[p]=t;
                break;
            }
        }
        
        reverse(nums,p+1,n-1);
    }
    void reverse(int a[],int l,int r){
        while(l<r){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
    }
}