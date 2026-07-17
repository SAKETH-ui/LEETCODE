class Solution {
    public int fib(int n) {
        int l,sl;
        if(n<=1)return n;
        l=fib(n-1);
        sl=fib(n-2);
        return l+sl;
    }

}