class Solution {
    public int minOperations(int[] nums) {
        int i=0,ans=0;
        int n=nums.length;
        while(true){
            Set<Integer> s=new HashSet<>();
            boolean f=false;
            for(int j=n-1;j>=i;j--){
                if(s.contains(nums[j])){
                    f=true;
                    return (j/3)+1;
                    
                }
                s.add(nums[j]);
            }
            if(f==false)break;
            i+=3;
            ans++;
        }
        return ans;
    }
}