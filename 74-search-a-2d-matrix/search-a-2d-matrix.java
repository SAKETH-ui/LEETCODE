class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int r=a.length,c=a[0].length;
        int low=0,high=(r*c)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int i=mid/c,j=mid%c;
            if(a[i][j]==t)return true;
            else if(a[i][j]>t)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}