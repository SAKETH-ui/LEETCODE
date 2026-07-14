class Solution {
    public int reverse(int n) {
        int x=Math.abs(n);
      int r=0,d=0;
      while(x!=0){
        if(r>(Integer.MAX_VALUE - d)/10)return 0;
        d=x%10;
        r=r*10+d;
        x=x/10;
      }  return (n<0)?(-r):r;
    }
}