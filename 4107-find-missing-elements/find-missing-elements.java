class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int max=Integer.MIN_VALUE; 
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        min=Math.min(min,nums[i]);
       }
       int []h=new int[max+1];
       for(int i=0;i<nums.length;i++)h[nums[i]]=1;
       List<Integer> l=new ArrayList<>();
       for(int i=min;i<=max;i++){
        if(h[i]==0&&i>min)l.add(i);
       }
       return l;
    }
}