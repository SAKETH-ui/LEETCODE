class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max = piles[0];
       Solution sc=new Solution();
        for (int pile : piles) {
            if (pile > max) 
            max = pile;
        }
        int low=1,high=max,ans=0;
        while(low<=high){
            int m=low+(high-low)/2;
            long total=sc.TH(piles,m);
            if(total>h){
                low=m+1;
            }
            else {
                ans=m;
                high=m-1;
            }
        }
        return ans;
}
public long TH(int []a,int r){
        long ans=0;
        for(int i=0;i<a.length;i++){
            double h=(double)a[i]/r;
            ans+=(int)Math.ceil(h);
        }
        return ans;
    }
    }
    
