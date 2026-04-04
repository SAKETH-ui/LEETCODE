import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= k) nums[i] = 0;
        }
        int c=0,i=0,j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            int s=nums[i]+nums[j];
            if(s==k){
                c++;
                i++;
                j--;
                }

            else if(s<k)i++;
            else j--;
        }
            return c;
    }
}