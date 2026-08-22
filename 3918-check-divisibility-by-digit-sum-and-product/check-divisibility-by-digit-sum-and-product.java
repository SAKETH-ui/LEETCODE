class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1,x=n;
        while(x!=0){
            int d=x%10;
            x/=10;
            p*=d;
            s+=d;
        }
        return n%(p+s)==0;
    }
}