class Solution {
    public boolean isPalindrome(int x) {
       int r=0;
       if(x<0)return false;
       int a=x;
       while(x!=0){
       
        
        r=10*r+x%10;
        x/=10;
       } 
       return a==r;
    }
}