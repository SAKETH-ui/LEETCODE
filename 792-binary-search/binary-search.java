class Solution {
    public int search(int[] nums, int t) {
        return BS(nums,0,nums.length-1,t);
    }
    public int BS(int []a,int l,int h,int t){
        if(l>h)return -1;
        int m=l+(h-l)/2;
        
        if(t>a[m]){
            return BS(a,m+1,h,t);
        }
        else if(t<a[m]){
            return BS(a,l,m-1,t);
        }
        else{
             return m;
        }
    }
}