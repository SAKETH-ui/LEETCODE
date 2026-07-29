
class Solution {
    public int maxProfit(int[] prices) {
        int m=0,s=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            s=Math.min(s,prices[i]);
            m=Math.max(m,prices[i]-s);
            }
                    return m;
        }

    }
