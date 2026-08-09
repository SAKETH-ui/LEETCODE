class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        List<Integer> ls=new ArrayList<>();
        int l=0,t=0,r=n-1,b=m-1;
        while(l<=r&&t<=b){
            for(int i=l;i<=r;i++){
            ls.add(nums[t][i]);
        }
        t++;
        for(int i=t;i<=b;i++){
            ls.add(nums[i][r]);
        }
        r--;
        if(t<=b){
        for(int i=r;i>=l;i--){
            ls.add(nums[b][i]);
        }
        b--;
        }
        if(l<=r){
        for(int i=b;i>=t;i--){
            ls.add(nums[i][l]);
        }
        l++;
        }
        }
        return ls;
    }
}