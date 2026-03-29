import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Code here
        int n=nums.length;
        int l=n/3;
        
        HashMap<Integer,Integer> a=new HashMap<>();
        
        for(int i=0;i<n;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer> list=new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : a.entrySet()){
            if(entry.getValue()>l)list.add(entry.getKey());
        }
        
        Collections.sort(list);
        
        return list;
    }
}