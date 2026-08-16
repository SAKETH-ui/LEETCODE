import java.util.*;
class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length;
        int l=0,r=n-1;
      while(l<r){
        int m=(l+r)/2;
        
        if(m%2==1)m--;
        if(a[m]==a[m+1])l=m+2;
        else r=m;
      }
      return a[l];
    }
}