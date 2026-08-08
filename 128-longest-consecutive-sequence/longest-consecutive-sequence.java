import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
       int l=1,x=Integer.MIN_VALUE;
        int c=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]-1==x){
            c++;
            x=nums[i];
        }
        else if(nums[i]!=x){
            c=1;
            x=nums[i];
        }
        l=Math.max(l,c);
       }
       return l;
    }
}