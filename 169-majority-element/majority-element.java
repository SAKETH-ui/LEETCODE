class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,ele=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele)cnt++;
            else cnt--;
            if(cnt==0){
                ele= nums[i];
                cnt=1;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele)c++;
            if(c>(nums.length/2))return ele;
        }
        return -1;
    }
}