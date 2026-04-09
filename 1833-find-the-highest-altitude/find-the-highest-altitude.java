class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0,s=0;
        for(int i=0;i<gain.length;i++){
            s+=gain[i];
            ans=Math.max(ans,s);
        }return ans;
    }
}