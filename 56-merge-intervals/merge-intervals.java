//chatgpt
import java.util.*;

class Solution {
    public int[][] merge(int[][] nums) {
        if(nums==null||nums.length<=1)return nums;
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>r=new ArrayList<>();
        int []c=nums[0];
        r.add(c);

        for(int[] x:nums){
            int ce=c[1];
            int s=x[0];
            int e=x[1];
            if(s<=ce)c[1]=Math.max(ce,e);
            else {
                c=x;
                r.add(c);
            }
        }
        return r.toArray(new int[r.size()][]);
    }
}