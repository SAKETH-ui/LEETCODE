class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
            Set<Integer> s=new HashSet<>();
            for(int j=n-1;j>=0;j--){
                if(s.contains(nums[j])){
                    return (j/3)+1;
                    
                }
                s.add(nums[j]);
            }
        return 0;
    }
}