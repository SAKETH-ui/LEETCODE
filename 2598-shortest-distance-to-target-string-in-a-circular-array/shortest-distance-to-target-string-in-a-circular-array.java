class Solution {
    public int closestTarget(String[] w, String t, int s) {
        int n=w.length;
        int ans=n;
        for(int i=0;i<n;i++){
            if(w[i].equals(t)){
                int d=Math.abs(i-s);
                d=Math.min(d,n-d);
                ans=Math.min(ans,d);
            }
        }
        return ans==n?-1:ans;
    }
}