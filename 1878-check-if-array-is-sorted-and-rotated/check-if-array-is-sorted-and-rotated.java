class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            rotate(nums,i);
            if(isSorted(nums))return true;
            rotate(nums,n-i);
        }
        return false;
    }
    void swap(int []a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    void rotate(int []a,int k){
        int n=a.length;
            for(int j=0;j<k/2;j++)swap(a,j,k-j-1);
            for(int j=k;j<k+(n-k)/2;j++)swap(a,j,n-j+k-1);
            for(int j=0;j<n/2;j++)swap(a,j,n-j-1);
    }
    boolean isSorted(int []a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1])return false;
        }
        return true;
    }
}