class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        List<Boolean> list=new ArrayList<>();
        int m=Integer.MIN_VALUE;
        for(int i=0;i<c.length;i++){
            m=Math.max(m,c[i]);
        }
        for(int i=0;i<c.length;i++){
            if(c[i]+ec>=m){
                list.add(true);
            }else list.add(false);
        }return list;
    }
}