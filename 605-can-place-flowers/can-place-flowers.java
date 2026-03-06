class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        boolean s=false;
        if(a.length==1&&a[0]==0)return true;

        for(int i=0;i<a.length;i++){
            if(i==0&&a[i]==0&&a[i+1]==0){
                a[i]=1;
                n--;
            }
            if(i==a.length-1&&a[i]==0&&a[i-1]==0){
                a[i]=1;
                n--;
            }
            if(i!=0&&i!=a.length-1&&a[i]==0&&a[i-1]==0&&a[i+1]==0){
                a[i]=1;
                n--;
            }
        }return n<=0;
    }
}