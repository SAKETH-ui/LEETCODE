import java.util.*;
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++)m1=Math.max(m1,nums1[i]);
        for(int i=0;i<nums1.length;i++)m2=Math.max(m2,nums2[i]);
        return m2-m1;
    }
}