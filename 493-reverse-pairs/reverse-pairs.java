class Solution {
    public int reversePairs(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int []a,int l,int h){
        if(l>=h)return 0;
        int m=l+(h-l)/2;
        int c=0;
        c+=mergeSort(a,l,m);
        c+=mergeSort(a,m+1,h);
        c+=countPairs(a,l,m,h);
        merge(a,l,m,h);
        return c;
    }
    public int countPairs(int a[],int l,int m,int h){
        int r=m+1,c=0;
        for(int i=l;i<=m;i++){
            while(r<=h && (long)a[i]>2L*a[r])r++;
            c+=r-(m+1);
        }
        return c;
    }
    public void merge(int []a,int l, int m,int h){
        int []t=new int[h-l+1];
        int left=l,right=m+1,k=0;
        while(left<=m && right<=h){
            if(a[left]<=a[right]){
                t[k++]=(a[left++]);
            }
            else {
               t[k++]=(a[right++]);
            }
        }
        while(left<=m)t[k++]=(a[left++]);

        while(right<=h)t[k++]=(a[right++]);

        for(int i=0;i<t.length;i++)a[l+i]=t[i];
    }
}