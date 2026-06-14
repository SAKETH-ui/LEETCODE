import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        
       int left=0;
       for(int r=0;r<nums.length;r++){
        if(nums[r]!=0){
            int t=nums[r];
            nums[r]=nums[left];
            nums[left]=t;
            left++;
        }
       }
    }
}