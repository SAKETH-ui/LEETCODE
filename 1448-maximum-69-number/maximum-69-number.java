class Solution {
    public int maximum69Number (int num) {
        int c=-1,p=0,t=num;
        while(t>0){
            if(t%10==6){
                c=p;
            }
            t/=10;
            p++;
        }
        return c==-1?num:num+3*(int)Math.pow(10,c);
    }
}