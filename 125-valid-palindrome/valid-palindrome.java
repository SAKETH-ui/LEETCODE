class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0,r=n-1;
        
        return f(s,l,r);
    }
    boolean f(String s,int l,int r){
        if(l>=r)return true;
        while((!Character.isDigit(s.charAt(l))&&!Character.isLetter(s.charAt(l)))&&l<r)l++;
        while((!Character.isDigit(s.charAt(r))&&!Character.isLetter(s.charAt(r)))&&l<r)r--;
        if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))return false;
        
        return f(s,l+1,r-1);
    }
}