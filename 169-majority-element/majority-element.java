class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums)mp.put(i,mp.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue()>nums.length/2)return e.getKey();
        }
        return -1;
    }
}