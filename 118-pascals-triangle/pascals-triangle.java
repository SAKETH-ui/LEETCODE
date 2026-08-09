class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> t=new ArrayList<>();
            for(int j=1;j<=i;j++){
                t.add(ncr(i-1,j-1));
            }
            l.add(t);
        }
        return l;
    }
    int ncr(int n,int r){
        int ans=1;
        for(int i=0;i<r;i++){
            ans*=(n-i);
            ans/=(i+1);
        }
        return ans;
    }

}