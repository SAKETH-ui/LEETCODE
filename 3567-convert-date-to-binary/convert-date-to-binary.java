class Solution {
    public String convertDateToBinary(String date) {
        int y,m,d;
        String []s=date.split("-");
        y=Integer.parseInt(s[0]);
        m=Integer.parseInt(s[1]);
        d=Integer.parseInt(s[2]);
        String yy="";
        while(y>0){
            yy=(y%2)+yy;
            y/=2;
        }
        String mm="";
        while(m>0){
            mm=(m%2)+mm;
            m/=2;
        }
        String dd="";
        while(d>0){
            dd=(d%2)+dd;
            d/=2;
        }
        String r="";
        r+=yy+"-"+mm+"-"+dd;
        return r;
    }
}