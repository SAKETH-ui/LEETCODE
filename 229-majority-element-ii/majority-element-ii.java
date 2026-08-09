import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Code here
        List<Integer> list=new ArrayList<>();
        int n=nums.length,cnt1=0,cnt2=0,ele1=0,ele2=0;
        int l=n/3;
        for(int i=0;i<n;i++){
            if(ele1==nums[i])cnt1++;
            else if(ele2==nums[i])cnt2++;
            else if(cnt1==0&&ele2!=nums[i]){
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0&& ele1!=nums[i]){
                ele2=nums[i];
                cnt2=1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1)c1++;
            else if(nums[i]==ele2)c2++;
        }
        if(c1>l)list.add(ele1);
        if(c2>l)list.add(ele2);
        return list;
    }
}