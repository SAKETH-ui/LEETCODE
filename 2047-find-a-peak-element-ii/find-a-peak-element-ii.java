class Solution {
    public int[] findPeakGrid(int[][] nums) {
        int m=nums.length,n=nums[0].length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=func(nums,m,n,mid);
            int left=mid-1>=0?nums[row][mid-1]:-1;
            int right=mid+1<n?nums[row][mid+1]:-1;
            if(nums[row][mid]>right&&nums[row][mid]>left){
                return new int[]{row,mid};
            }
            else if(left>nums[row][mid]){
                high=mid-1;
            }
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }
    static int func(int nums[][],int m,int n,int i){
        int max=0;
        for(int j=0;j<m;j++){
            if(nums[j][i]>nums[max][i]){
                max=j;
            }
        }
        return max;
    }
}