class Solution {
    public String convertDateToBinary(String date) {
        int y,m,d;
        String []s=date.split("-");
        y=Integer.parseInt(s[0]);
        m=Integer.parseInt(s[1]);
        d=Integer.parseInt(s[2]);
        // String yy="";
        // while(y>0){
        //     yy=(y%2)+yy;
        //     y/=2;
        // }
        // String mm="";
        // while(m>0){
        //     mm=(m%2)+mm;
        //     m/=2;
        // }
        // String dd="";
        // while(d>0){
        //     dd=(d%2)+dd;
        //     d/=2;
        // }
        // String r="";
        // r+=yy+"-"+mm+"-"+dd;
        // return r;
        StringBuilder yy=new StringBuilder();
        StringBuilder mm=new StringBuilder();
        StringBuilder dd=new StringBuilder();
        while(y>0){
            yy.append(y%2);
            y/=2;
        }
        yy=yy.reverse();
        yy.append("-");
        while(m>0){
            mm.append(m%2);
            m/=2;
        }
        mm=mm.reverse();
        yy.append(mm);
        yy.append("-");
        while(d>0){
            dd.append(d%2);
            d/=2;
        }
        dd=dd.reverse();
        yy.append(dd);
        return yy.toString();
    }
}