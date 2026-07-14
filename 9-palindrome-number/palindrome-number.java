class Solution {
    public boolean isPalindrome(int x) {
       int r=0,d=0;
       if(x<0)return false;
       int a=x;
       while(x!=0){
        d=x%10;
        r=10*r+d;
        x/=10;
       } 
       return a==r;
    }
}