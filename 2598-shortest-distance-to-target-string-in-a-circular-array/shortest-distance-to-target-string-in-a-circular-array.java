class Solution {
    public int closestTarget(String[] w, String t, int s) {
        int f=0,b=0;
        int i=s;
        int n=w.length;
        while(true){
            if(w[i].equals(t))break;
            i++;
            f++;
            if(i==n)i=0;
            if(i==s)break;
        }
        i=s;
        while(true){
            if(w[i].equals(t))break;
            i--;
            b++;
            if(i<0)i=n-1;
            if(i==s)break;
        }
        int ans=Math.min(f,b);
        return (f==n&&b==n)?-1:ans;
        
    }
}