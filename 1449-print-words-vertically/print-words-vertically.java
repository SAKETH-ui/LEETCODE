import java.util.*;
class Solution {
    public List<String> printVertically(String s) {
        String []st=s.split(" ");

        List<String> ans=new ArrayList<>();

        int maxlen=0;
        for(String i:st){
            maxlen=Math.max(i.length(),maxlen);
        }
        for(int c=0;c<maxlen;c++){
            StringBuilder sb=new StringBuilder();
            for(int r=0;r<st.length;r++){
                // if col is less than length of the row's word this tell 
                // for col=0 atleast 0 length 1st letter is to append 
                // for col=1 here we can append only 1st letter of word having length more than 1
                // if this condition is false then that is when there is no elements of that row word have letter to append so we append space
                if(c<st[r].length()){
                    sb.append(st[r].charAt(c));
                }
                else sb.append(' ');
            }
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
                sb.deleteCharAt(sb.length() - 1);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}