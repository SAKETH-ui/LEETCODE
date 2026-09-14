class Solution {
    public String largestOddNumber(String nums) {
        int j=0,n=nums.length();
        for(int i=0;i<n;i++){
            int num=(int)nums.charAt(n-i-1);
            if(num%2!=0){
                j=n-i;
                break;
            }
        }
        return nums.substring(0,j);
    }
}