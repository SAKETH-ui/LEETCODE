import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double s=0,w=0;
        for(int i=0;i<k;i++){
            w+=nums[i];
        }
        s=w;
        for(int i=k;i<nums.length;i++){
            w-=nums[i-k];
            w+=nums[i];
            s=Math.max(s,w);
        } return s/k;
    }
}