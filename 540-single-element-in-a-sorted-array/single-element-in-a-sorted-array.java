import java.util.*;
class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length;
        int l=0,r=n-1;
      while(l<r){
        int m=(l+r)/2;
        if(m>0&&a[m]==a[m-1]){
            if(m%2==0)r=m-1;
            else l=m+1;
        }
        else if(m<n-1&&a[m]==a[m+1]){
            if(m%2==0)l=m+1;
            else r=m-1;
        }
        else 
        return a[m];
      }
      return a[l];
    }
}