import java.util.*;
class Solution {
    public int maxSubArray(int[] a) {
        int cs=0,m=a[0];
        for(int i=0;i<a.length;i++){
            cs+=a[i];
            if(cs>m)m=cs;
            if(cs<0){
                cs=0;
            }
        }return m;
    }
}