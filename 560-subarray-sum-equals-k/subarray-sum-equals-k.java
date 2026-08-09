class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0,n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        int s=0;
        m.put(0,1);
        
        for(int i=0;i<n;i++){
            s+=nums[i];
            int r=s-k;
            if(m.containsKey(r))
            c+=m.get(r);
            m.put(s,m.getOrDefault(s,0)+1);
        }
        return c;
    }
}