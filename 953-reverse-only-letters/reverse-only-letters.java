
class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0,r=s.length()-1;
        char[] a=s.toCharArray();
        while(l<r){
            while(l<r && !Character.isLetter(a[l])) l++;
            while(l<r && !Character.isLetter(a[r])) r--;
            char t=a[l];
            a[l++]=a[r];
            a[r--]=t;
        }
        return new String(a);
        
    }
}